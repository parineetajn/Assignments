package healthycoderapp;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.runners.Parameterized;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static healthycoderapp.BMICalculator.isDietRecommended;
import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    @BeforeAll
    static void beforeAll()
    {
        System.out.println("Before all unit test");
    }

    @AfterAll
    static void afterAll()
    {
        System.out.println("After all unit test");
    }


    @Nested
    class IsDietRecommended{
        @Test
        void should_ReturnTrue_When_isDietRecommended()
        {
            //given
            Double weight=90.5;
            Double height=1.72;

            //when
            Boolean recommended=isDietRecommended(weight,height);

            //then
            assertTrue(recommended);
        }
        @Test
        void should_ReturnFalse_When_isDietRecommended()
        {
            //given
            Double weight=50.5;
            Double height=1.92;

            //when
            Boolean recommended=isDietRecommended(weight,height);

            //then
            assertFalse(recommended);
        }
        @Test
        void should_ThrowException_When_heightIsZero()
        {
            //given
            Double weight=50.5;
            Double height=0.0;

            //when
            Executable executable =()-> isDietRecommended(weight,height);

            //then
            assertThrows(ArithmeticException.class, executable);
        }

    }


    @Nested
    class FindCoderWithTwoBMITests
    {
        @Test
        void should_ReturnCoderWithWorstBMI_WhenCoder_List_NotEmpty()
        {
            //given
            List<Coder> list=new ArrayList<>();
            list.add(new Coder(1.80,60.0));
            list.add(new Coder(1.82,98.0));
            list.add(new Coder(1.82,64.0));

            //when
            Coder coder =BMICalculator.findCoderWithWorstBMI(list);

            //then
            assertAll (
                    () -> assertEquals(1.82,coder.getHeight()),
                    () -> assertEquals(98.0,coder.getWeight())
            );
        }

        @Test
        void should_ReturnCoderWithWorstBMI_WhenCoder_List_Empty()
        {
            //given
            List<Coder> list1=new ArrayList<>();

            //when
            Coder c =BMICalculator.findCoderWithWorstBMI(list1);

            //then
            assertNull(c);
        }
        @Test
        void should_Return_CorrectBMIScoreArray_WhenCoderListNotEmpty()
        {
            //given
            List<Coder> list2=new ArrayList<>();
            list2.add(new Coder(1.80,60.0));
            list2.add(new Coder(1.82,98.0));
            list2.add(new Coder(1.82,64.0));

            double[] expected = {18.52,29.59,19.32};

            //when
            double[] val=BMICalculator.getBMIScores(list2);

            //then
            assertArrayEquals(expected,val);
        }
    }

    @Nested
    class GetBMIScoreTests
    {
        @Test
        void should_ReturnCodeWithWorstBMIIn1Ms_When_CoderListhas10000Elements()
        {
            //given
            List<Coder> coders=new ArrayList<>();
            for(int i=0;i<10000;i++)
            {
                coders.add(new Coder(1.0+i,10.0+i));
            }

            //when
            Executable executable=()->BMICalculator.findCoderWithWorstBMI(coders);

            //then
            assertTimeout(Duration.ofMillis(100),executable);
        }

    }

}
package healthycoderapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DietPlannerTest {
private DietPlanner dietPlanner;

@BeforeEach
void setUp()
{
    this.dietPlanner=new DietPlanner(20,30,50);
}

@AfterEach
void afterEach()
{
    System.out.println("Unit test");
}

    @RepeatedTest(value=10,name =RepeatedTest.LONG_DISPLAY_NAME)
    void should_ReturnCorrectDietPlan_when_Correct_Coder1(){
        //given
        Coder coder=new Coder(1.82,75.0,26,Gender.MALE);
        DietPlan expected=new DietPlan(2202,110,73,275);

        //when
        DietPlan actual=dietPlanner.calculateDiet(coder);

        //then
        assertAll(
                ()-> assertEquals(expected.getCalories(),actual.getCalories()),
                ()-> assertEquals(expected.getProtein(),actual.getProtein()),
                ()-> assertEquals(expected.getFat(),actual.getFat()),
                ()-> assertEquals(expected.getCarbohydrate(),actual.getCarbohydrate())

        );

    }

    @Test
    void should_ReturnCorrectDietPlan_when_Correct_Coder(){
        //given
        Coder coder=new Coder(1.82,75.0,26,Gender.MALE);
        DietPlan expected=new DietPlan(2202,110,73,275);

        //when
        DietPlan actual=dietPlanner.calculateDiet(coder);

        //then
        assertAll(
                ()-> assertEquals(expected.getCalories(),actual.getCalories()),
                ()-> assertEquals(expected.getProtein(),actual.getProtein()),
                ()-> assertEquals(expected.getFat(),actual.getFat()),
                ()-> assertEquals(expected.getCarbohydrate(),actual.getCarbohydrate())

        );

    }

}
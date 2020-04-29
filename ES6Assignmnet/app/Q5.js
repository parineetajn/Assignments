let getAllCombinations = (word, newWord = '', newWords = []) => {
    if(!word){
        newWords.push(newWord);
        return;
    }
    for (let i = 0; i < word.length; i++){
        newWord +=word[i];
      getAllCombinations(word.slice(0, i) + word.slice(i + 1), newWord, newWords);
      newWord=newWord.slice(0,newWord.length-1);
    }
 

    return [...new Set(newWords)];
    };

export{getAllCombinations};
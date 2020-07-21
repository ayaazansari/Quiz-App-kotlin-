package com.example.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS :String = "total_questions"
    const val CORRECT_ANSWERS :String = "correct_answers"

    fun getQuestions(): ArrayList<Questions>{
        var questionsList= ArrayList<Questions>()

        val ques1 = Questions(1,"What country does this flag belong to?", R.drawable.flag_of_argentina
            ,"Indiana","Austria","Argentina","Australia",3)
        questionsList.add(ques1)


        val ques2 = Questions(2,"What country does this flag belong to?", R.drawable.flag_of_austrelia
            ,"England","Austria","Sudan","Australia",4)
        questionsList.add(ques2)


        val ques3 = Questions(3,"What country does this flag belong to?", R.drawable.flag_of_canada
            ,"Africa","Brazil","Canada","North korea",3)
        questionsList.add(ques3)


        val ques4 = Questions(4,"What country does this flag belong to?", R.drawable.flag_of_germany
            ,"Germany","Switzerland","Japan","United kingdom",1)
        questionsList.add(ques4)


        val ques5 = Questions(5,"What country does this flag belong to?", R.drawable.flag_of_japan
            ,"China","Japan","North korea","South korea",2)
        questionsList.add(ques5)


        val ques6 = Questions(6,"What country does this flag belong to?", R.drawable.flag_of_neitherlands
            ,"Indiana","Netherlands","South Africa","Sweden",2)
        questionsList.add(ques6)


        val ques7 = Questions(7,"What country does this flag belong to?", R.drawable.flag_of_norway
            ,"France","Russia","United Kingdom","Norway",4)
        questionsList.add(ques7)


        val ques8 = Questions(8,"What country does this flag belong to?", R.drawable.flag_of_swedan
            ,"Indiana","Sweden","India","Slovenia",2)
        questionsList.add(ques8)


        val ques9 = Questions(9,"What country does this flag belong to?", R.drawable.flag_of_switzerland
            ,"France","Egypt","Switzerland","Britain",3)
        questionsList.add(ques9)


        val ques10 = Questions(10,"What country does this flag belong to?", R.drawable.flag_of_uk
            ,"United Kingdom","U.S.A.","England","Russia",1)
        questionsList.add(ques10)


        
        return questionsList

    }
}
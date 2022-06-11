package com.anmol.myquizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWER: String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

//      Ques 1
        val que1 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "India", "Argentina", "Australia", "Brazil",
            correctAnswer = 1)

        questionsList.add(que1)


//      Ques  2
        val que2 = Question(
            2,"What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "India", "Argentina", "Australia", "Brazil",
            correctAnswer = 3)

        questionsList.add(que2)


//      Ques 3
        val que3 = Question(
            3,"What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "France", "Argentina", "Australia", "Brazil",
            correctAnswer = 2)

        questionsList.add(que3)

//        Ques 4
        val que4 = Question(
            4,"What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "India", "Argentina", "United Kingdom", "Brazil",
            correctAnswer = 4)

        questionsList.add(que4)

//        Ques 5
        val que5 = Question(
            5,"What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Bangladesh", "Belgium", "Australia", "Brazil",
            correctAnswer = 2)

        questionsList.add(que5)

//        Ques 6
        val que6 = Question(
            6,"What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Bhutan", "Argentina", "Denmark", "Brazil",
            correctAnswer = 3)

        questionsList.add(que6)

//        Ques 7
        val que7 = Question(
            7,"What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany", "Argentina", "Australia", "Canada",
            correctAnswer = 1)

        questionsList.add(que7)

//        Ques 8
        val que8 = Question(
            8,"What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "China", "Fiji", "Australia", "Brazil",
            correctAnswer = 2)

        questionsList.add(que8)

//        Ques 9
        val que9 = Question(
            9,"What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Finland", "Argentina", "New-Zealand", "Brazil",
            correctAnswer = 3)

        questionsList.add(que9)

//        Ques 10
        val que10 = Question(
            10,"What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Indonesia", "Italy", "Australia", "Kuwait",
            correctAnswer = 4)

        questionsList.add(que10)

        return questionsList

    }

}
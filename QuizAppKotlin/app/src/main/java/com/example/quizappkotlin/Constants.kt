package com.example.quizappkotlin

object Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        //Question1
        val question1 = Question (
            1,
            "What Country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "Bangladesh",
            "India",
            1
                )
        questionList.add(question1)

        //Question2
        val question2 = Question (
            2,
            "What Country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "America",
            "Australia",
            "NewZealand",
            "India",
            2
        )
        questionList.add(question2)

        //Question3
        val question3 = Question (
            3,
            "What Country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Argentina",
            "Australia",
            "Belgium",
            "Germany",
            3
        )
        questionList.add(question3)

        //Question4
        val question4 = Question (
            4,
            "What Country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Argentina",
            "Brazil",
            "Bangladesh",
            "Cameron",
            2
        )
        questionList.add(question4)


        //Question5
        val question5 = Question (
            5,
            "What Country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Argentina",
            "Australia",
            "England",
            "Denmark",
            4
        )
        questionList.add(question5)

        //Question6
        val question6 = Question (
            6,
            "What Country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Cameron",
            "fiji",
            "Bangladesh",
            "Kuwait",
            1
        )
        questionList.add(question6)


        //Question7
        val question7 = Question (
            7,
            "What Country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Belgium",
            "Denmark",
            "Italy",
            "Germany",
            4
        )
        questionList.add(question7)


        //Question8
        val question8 = Question (
            8,
            "What Country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Afghanistan",
            "India",
            "Bangladesh",
            "Nepal",
            2
        )
        questionList.add(question8)


        //Question9
        val question9 = Question (
            9,
            "What Country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "New_zealand",
            "Australia",
            "America",
            "England",
            1
        )
        questionList.add(question9)
        return questionList
    }

}
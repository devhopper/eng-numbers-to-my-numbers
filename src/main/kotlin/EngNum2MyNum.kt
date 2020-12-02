// accept only Integer
fun convertEngNum2My(engNumText:String):String{

    val difference = 4112

    try{

        var myText = ""

        // to validate input
        engNumText.toInt()

        for(i in engNumText.indices){
            val engCodePoint = engNumText.codePointAt(i)
            val myCodePoint = engCodePoint + difference

            val myCharArray = Character.toChars(myCodePoint)

            myText += String(myCharArray)
        }

        return myText

    }catch(e:IllegalArgumentException){
        return e.toString()
    }
}
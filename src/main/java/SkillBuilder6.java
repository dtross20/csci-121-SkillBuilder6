
/**
 * SkillBuilder6 is a class for completing this Skill
 * Builder assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder6 {

    // replace this line with your constants
    final String con1 = "y";
    final String  con2 = "Y";
    final String con3 = "t";
    final String con4 ="T";

    public static String findTYPattern(String s)
    {
        // replace this line with your code
        String ross1 = "";
        String deyvon1 = s.toUpperCase().trim();
        boolean copy = false;
        for (int x = 0; x < deyvon1.length(); x++){
            if(deyvon1.charAt(x) == 'T'){
                copy = true;
            }else{
                if (deyvon1.charAt(x) == 'Y' && copy == true){
                    ross1 += s.charAt(x);
                    copy = false;
                    break;
                }
            } if (copy == true){

                //add the letter of the current index to Virgil expo
                ross1 += s.charAt(x);


            }

            ;
        }
        if(ross1.contains("Y") || ross1.contains("y")){
            return ross1;
        }
        return "";
}

}

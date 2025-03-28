import java.util.Arrays;

public class Solutions {

    public boolean isAnagram(String a, String b) {
        char [] ConvertA=a.toLowerCase().toCharArray();
        char [] ConvertB =b.toLowerCase().toCharArray();
        Arrays.sort(ConvertA);
        Arrays.sort(ConvertB);

        return Arrays.equals (ConvertA ,ConvertB );
    }



}

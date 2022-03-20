package lesson16;

public class Main1 {
    public static void main(String[] args) {
        StringUtilImpl util = new StringUtilImpl();
//        util.div("546", "0222");
        double[] nums = null;
        try {
           nums = (util.findNumbers("vebd125bdd5451.-/456"));
        } catch (CustomException e) {
            e.printStackTrace();
        }

        for (double d: nums){
            System.out.println(d);
        }
    }
}

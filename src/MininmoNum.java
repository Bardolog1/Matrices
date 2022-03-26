public class MininmoNum {
    public static void main(String[] args) {
        int sta[] = {6,2,3,8};
        int staR[] = new int[5];


        for (int i = 0; i < sta.length; i++) {
            System.out.print(" "+sta[i]);
        }

        for (int i = 0; i < staR.length; i++) {
            staR[i]= makeArrayConsecutive2(sta);
        }
        System.out.println(" ");


        for (int i = 0; i < staR.length; i++) {
            System.out.print(" "+staR[i]);
        }






    }

    public static int makeArrayConsecutive2(int[] statues){
        int[] m = new int[2];
        m=minNum(statues);
        int large = m[1]-m[0]+1;
        return large - statues.length;
    }

    public static int[] minNum(int[] array){
        int[] m = new int[2];
        m[0]= array[0];
        m[1]= array[0];

        for (int i = 1; i <array.length ; i++) {
            if (m[0] >array[i]) m[0] = array[i];
            if (m[1] <array[i]) m[1] = array[i];
        }

        return m;
    }



}

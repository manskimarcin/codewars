class Diamond {
    public static String print(int n) {
        String diamond="";

        if(n%2 != 0 && n>=0){
            //upper part
            for(int i = 1; i <= (n-1)/2; i++) {
                for(int j = (n/2-i)+1; j >= 1  ; j--){
                    System.out.print(" ");
                    diamond = diamond +" ";
                }
                for(int j = 1; j <=(2*i-1); j++){
                    System.out.print("*");
                    diamond = diamond +"*";
                }
                System.out.println("");
                diamond = diamond +"\n";
            }
            //middle part
            for(int i = 1; i <= n; i++) {
                System.out.print("*");
                diamond = diamond +"*";
            }
            System.out.println();
            diamond = diamond +"\n";

            // bottom part
            for(int i = 1; i <= ((n-1)/2); i++) {
                for(int j = 1; j <=(n/2+i)-n/2; j++){
                    System.out.print(" ");
                    diamond = diamond +" ";
                }
                for(int j = ((n-1)/2-i)*2+1; j >= 1  ; j--){
                    System.out.print("*");
                    diamond = diamond +"*";
                }
                System.out.println();
                diamond = diamond +"\n";
            }

          //  System.out.println("diamencik");
            System.out.println(diamond);
            // System.out.println("wartość n: "+n);
            return diamond;
        }
        else return null;


    }
}
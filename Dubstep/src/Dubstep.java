public class Dubstep {
    public static String SongDecoder (String song)
    {
        String decodedSong="";
        System.out.println(song+ "\n");

        for(int i = 0; i < song.length()-2; i++){
            String buff = "";

            for(int j = i; j < i+3; j++ ){

                buff = buff + song.charAt(j);

                System.out.print(song.charAt(j));
            }
            if(buff.equals("WUB")){
                i=i+2;
                System.out.print(" wykryte");
            }
            else{
                System.out.print(" nie wykryte");
                for(int j = 0; j < 3; j++){

                }
            }

            System.out.println();
        }

        System.out.println("result: "+decodedSong);
        return decodedSong;
    }
}
public class Dubstep {

    public static void main(String[] args) {
        // write your code here
        Dubstep.SongDecoder("WUBWUBABCWUB");
        System.out.println("____________________________________");
        Dubstep.SongDecoder("RWUBWUBWUBLWUB");

    }
    public static String SongDecoder (String song)
    {
        String decodedSong=song.replaceAll("WUB"," ");
        return decodedSong.trim().replaceAll(" +"," ");
    }
}
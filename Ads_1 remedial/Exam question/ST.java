import java.util.*;

public class ST{
    String moviename;
    public ST(){
        
    }
    public ST(String moviename){
        this.moviename = moviename;

    }
    public void setmovie(String moviename){
        this.moviename = moviename;
    }
    public String getmovie(){
        return this.moviename;
    }
    public void fresult(){
        System.out.println("Your fav movie is: " + moviename);
    }
}
























// public class ST {
//     String fmovie;
//     String dir;
//     String hero;
//     ST[]arr;
//     int arrsize;
//     public ST(String fmovie, String dir, String hero){
//         this.fmovie = fmovie;
//         this.dir = dir;
//         this.hero = hero;
//     }
//     public ST(){
//         arr = new ST[10];
//         arrsize = 0;
//     }
//     public void addMovie(ST st){
//          if (arrsize < arr.length){
//                 resize();
//             }
//         for (int i = 0;i < arr.length;i++) {
//             if (arr[i]==null) {
//                 arr[i] = st;
//                 arrsize++;
//                 break;
//             }
            
//         }

//     }
//     public void getmovie(String hname){
//         for (int  i = 0;i < arrsize;i++) {
//             if (arr[i].gethero().equals(hname)) {
//                 System.out.println(arr[i]);
                
//             }
            
//         }

//     }
//     public void resize(){
//         if (arrsize < arr.length){
//             arrsize = arrsize * 2;
//         }
//     }
//     public void setfmovie(String moviename){
//         fmovie = moviename;
//     }
//     public String getfmovie(){
//         return fmovie;
//     }
//     public void setDir(String newdir){
//        this.dir = dir;
//     }
//     public String getDir(){
//         return dir;
//     }
//     public void sethero(String newhero){
//         this.hero = newhero;
//     }
//     public String gethero() {
//         return hero;
//     }
//     public String toString(){
//         return this. fmovie ;
//     }
// }
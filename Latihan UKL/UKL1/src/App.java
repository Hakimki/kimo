public class App {
    public static void main(String[] args){
        //Diketahui nilai suku pertama adalah 7 selisih antar suku adalah 10, tampilkan deret mulai dari suku ke 15 sampai 20
        
        int a = 7;
        int b = 10;
        int n = 15;
        int n2 = 20;
        total = 0;

        for(int i = 0; i < n2; i++){
            a = a + b;
            if (i >= n){
                System.out.println("suku ke " + i + "adalah " + a);
            }
        }
    }
}

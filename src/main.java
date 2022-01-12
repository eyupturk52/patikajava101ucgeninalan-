//scanner sınıfını dahil ettik
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //degişkenleri tanımladık
        double birincikenar,ikincikenar,ucuncukenar;
        double u;
        double alan;
        System.out.print("kenar uzunluklarını giriniz:");
        birincikenar=input.nextDouble();
        ikincikenar=input.nextDouble();
        ucuncukenar=input.nextDouble();
        //𝑢 = (a+b+c) / 2
        //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        u=(birincikenar+ikincikenar+ucuncukenar)/2;
        alan=Math.sqrt(u*(u-birincikenar)*(u-ikincikenar)*(u-ucuncukenar));
        System.out.print("üçgenin alanı="+alan);
    }
}


public class AnakAyam {
	public static void main (String[]args) {
		int i, n;
		n=10;
		System.out.println ("Anak ayam turun 10");
		for (i = 10; i > 1; i-=1) { 
			n=i-1;
			System.out.println ("Anak ayam turun "+i + " mati satu tinggal "+n);
		}
		System.out.println ("Anak ayam turun 1 mati satu tinggal induknya.");
	}
}
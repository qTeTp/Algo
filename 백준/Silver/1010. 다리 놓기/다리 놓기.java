import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int num;
	double[] n;
	double[] m;
	double[] aiai;

	void a() {
		num = sc.nextInt();
		n = new double[num];
		m = new double[num];
		aiai = new double[num];
		for (int i = 0; i < num; i++) {
			n[i] = sc.nextLong();
			m[i] = sc.nextLong();
		}

		for (int i = 0; i < num; i++) {
			if (n[i] == m[i]) {
				aiai[i] = 1;
			} else if (n[i] < m[i]) {
				aiai[i] = fact(m[i]) / (fact(m[i] - n[i]) * fact(n[i]));
			} else {
				aiai[i] = fact(n[i]) / (fact(n[i] - m[i]) * fact(m[i]));
			}
			System.out.printf("%.0f\n", aiai[i]);
		}
	}

	public double fact(double n) {
		if (n <= 1) {
			return n;
		} else
			return fact(n - 1) * n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main a = new Main();
		a.a();
	}
}
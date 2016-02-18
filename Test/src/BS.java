import java.util.Scanner;

public class BS {
	public int intArr[];
	public Scanner sc;

	public static void main(String[] args) {
		BS bs = new BS();
		bs.start();
	}

	public void start() {
		init();
		run();
	}

	public void init() {
		sc = new Scanner(System.in);
		System.out.println("������ �Է�!");
		intArr = new int[sc.nextInt()];
	}

	public void run() {
		int find = 0, index;
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = sc.nextInt();
		}
		System.out.println("ã���� �ϴ� �� �Է�");
		find = sc.nextInt();
		index = BinarySearch(intArr, find);

		if (index != -1) {
			System.out.println("ã�����ϴ� ���� �ε���  = " + index);
		} else {
			System.out.println("�׷� �� ����");
		}

		sc.close();

	}

	public static int BinarySearch(int intArr[], int find) {
		int start, end, mid;
		start = 0;
		end = intArr.length - 1;

		while (start <= end) {
			mid = (start + end) / 2;
			if (intArr[mid] == find) {
				return mid;
			} else if (intArr[mid] < find) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

}
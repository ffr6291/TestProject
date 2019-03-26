package at.fhv.oo;

import java.util.Scanner;

public class Point {
	public int[] _topleft = new int[8];
	private int xdelta;
	private int ydelta;

	public int[] point1() {

		Scanner sc = new Scanner(System.in);

		System.out.print("TopLeft: X-Koordinate: ");
		_topleft[0] = sc.nextInt();
		System.out.print("TopLeft: Y-Koordinate: ");

		_topleft[1] = sc.nextInt();
		System.out.print("TopLeft liegt auf den Koordinaten ");
		System.out.print("[" + _topleft[0] + "|");
		System.out.println(_topleft[1] + "]");

		System.out.print("BotRight: X-Koordinate: ");
		_topleft[6] = sc.nextInt();
		System.out.print("BotRight: Y-Koordinate: ");

		_topleft[7] = sc.nextInt();
		System.out.print("BotRight liegt auf den Koordinaten ");
		System.out.print("[" + _topleft[6] + "|");
		System.out.println(_topleft[7] + "]");

		_topleft[2] = _topleft[6];
		_topleft[3] = _topleft[1];
		_topleft[4] = _topleft[0];
		_topleft[5] = _topleft[7];
		xdelta = (_topleft[6] - _topleft[4]);
		ydelta = (_topleft[1] - _topleft[5]);

		return _topleft;
	}

	public void shift(int newxvalue, int newyvalue) {
		_topleft[0] = newxvalue;
		_topleft[1] = newyvalue;
		_topleft[2] = newxvalue + xdelta;
		_topleft[3] = newyvalue;
		_topleft[4] = newxvalue;
		_topleft[5] = newyvalue - ydelta;
		_topleft[6] = newxvalue + xdelta;
		_topleft[7] = newyvalue - ydelta;

		System.out.println("Shifted rectange:");
		System.out.print("TopLeft liegt auf den Koordinaten ");
		System.out.print("[" + _topleft[0] + "|");
		System.out.println(_topleft[1] + "]");
		System.out.print("TopRight liegt auf den Koordinaten ");
		System.out.print("[" + _topleft[2] + "|");
		System.out.println(_topleft[3] + "]");
		System.out.print("BotLeft liegt auf den Koordinaten ");
		System.out.print("[" + _topleft[4] + "|");
		System.out.println(_topleft[5] + "]");
		System.out.print("BotRight liegt auf den Koordinaten ");
		System.out.print("[" + _topleft[6] + "|");
		System.out.println(_topleft[7] + "]");

	}

	public void rotate(int value) {
		System.out.println("Xdelta" + xdelta);
		System.out.println("Ydelta" + ydelta);
		if (value == 1) {
			_topleft[0] = _topleft[0];
			_topleft[1] = _topleft[1] + xdelta;
			_topleft[2] = _topleft[0] + ydelta;
			_topleft[3] = _topleft[1];
			_topleft[4] = _topleft[0];
			_topleft[5] = _topleft[1] - xdelta;
			_topleft[6] = _topleft[0] + ydelta;
			_topleft[7] = _topleft[1] - xdelta;
			for (int i = 0; i < _topleft.length; i++) {
				System.out.println(_topleft[i]);
			}
		} else {
			if (value == 2) {
				_topleft[0] = _topleft[0]+xdelta;
				_topleft[1] = _topleft[1] + xdelta;
				_topleft[2] = _topleft[0] + ydelta;
				_topleft[3] = _topleft[1];
				_topleft[4] = _topleft[0];
				_topleft[5] = _topleft[1] - xdelta;
				_topleft[6] = _topleft[0] + ydelta;
				_topleft[7] = _topleft[1] - xdelta;
				for (int i = 0; i < _topleft.length; i++) {
					System.out.println(_topleft[i]);
				}
			} else {
				if (value == 3) {
					_topleft[0] = _topleft[0];
					_topleft[1] = _topleft[1] + xdelta;
					_topleft[2] = _topleft[0] + ydelta;
					_topleft[3] = _topleft[1];
					_topleft[4] = _topleft[0];
					_topleft[5] = _topleft[1] - xdelta;
					_topleft[6] = _topleft[0] + ydelta;
					_topleft[7] = _topleft[1] - xdelta;
					for (int i = 0; i < _topleft.length; i++) {
						System.out.println(_topleft[i]);
					}
				} else {
					if (value == 4) {
						_topleft[0] = _topleft[0];
						_topleft[1] = _topleft[1] + xdelta;
						_topleft[2] = _topleft[0] + ydelta;
						_topleft[3] = _topleft[1];
						_topleft[4] = _topleft[0];
						_topleft[5] = _topleft[1] - xdelta;
						_topleft[6] = _topleft[0] + ydelta;
						_topleft[7] = _topleft[1] - xdelta;
						for (int i = 0; i < _topleft.length; i++) {
							System.out.println(_topleft[i]);
						}
					}
				}
			}
		}
	}

	public boolean square() {
		boolean dice = false;
		if (xdelta == ydelta) {
			dice = true;
			System.out.println("Es ist ein Würfel");
		} else {
			System.out.println("Es ist kein Würfel");
		}
		return dice;
	}
	

}

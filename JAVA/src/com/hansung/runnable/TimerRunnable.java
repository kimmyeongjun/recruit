package com.hansung.runnable;

import javax.swing.JLabel;

public class TimerRunnable implements Runnable {
	JLabel timerLabel;

	public TimerRunnable(JLabel tiemrLabel) {
		this.timerLabel = tiemrLabel;
	}

	@Override
	public void run() {
		int n = 0;
		while (true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

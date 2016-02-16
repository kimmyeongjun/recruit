package com.hansung.thread;

import javax.swing.JLabel;

class TimerThread extends Thread {
	JLabel timerLabel;

	public TimerThread(JLabel tiemrLabel) {
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

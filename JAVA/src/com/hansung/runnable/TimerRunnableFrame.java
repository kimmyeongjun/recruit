package com.hansung.runnable;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.hansung.thread.TimerThreadFrame;

public class TimerRunnableFrame extends JFrame{
	public TimerRunnableFrame() {
		this.setTitle("Ÿ�̸� ������ ����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		//
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		setSize(250, 150);
		setVisible(true);

		TimerRunnable runnable = new TimerRunnable(timerLabel);
		Thread thread = new Thread(runnable);

		
		thread.start();
		
	}

	public static void main(String[] args) {
			new TimerThreadFrame();
	}

}
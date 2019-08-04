package controller;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import viewmodel.ViewModel;

public class WordListener implements MouseListener {
	Component comp;
	ViewModel vm;
	int index;
	public WordListener(ViewModel vm, Component comp, int index) {
		this.comp = comp;
		this.vm = vm;
		this.index = index;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		vm.wordSelected(index);
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		comp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comp.setForeground(Color.GRAY);
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		comp.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		comp.setForeground(Color.WHITE);
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}

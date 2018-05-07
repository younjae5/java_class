package kmu.oop.practice.lab4.test;

import kmu.oop.practice.lab4.common.*;
import kmu.oop.practice.lab4.theater.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.JUnitCore;

import static org.mockito.Mockito.spy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.never;

@RunWith(MockitoJUnitRunner.class)
public class Lab4Test {

	String lname1[] =  {"Royal", "Premium", "economy"};
	int size1[] = {10, 30, 60};
	TheaterType type1;
	int admissionFee1BB[] = { 100000, 60000, 30000};
	ReservedProgram program1BB;
	Theater th1;
	Common cm, cm2;
	DoubleFor df;
	
	   @Before
	   public void initialize(){
			type1 = new TheaterType("Mordern", 3, lname1, size1);
			program1BB = new ReservedProgram(type1, "Beauty and Beast", admissionFee1BB);
			cm = new Common();
//		    df = spy(cm);
//		    program1BB.setDoubleFor(df);
		    cm2 = spy(cm);
		    program1BB.setDoubleFor(cm2);
			th1 = new Theater(type1, program1BB);
	   }

	   @Test
	public void test1() throws Exception {
		
		program1BB.sell("Royal", 3);
		program1BB.reserve("Premium", 7);
		System.out.println("\nTheater: " + program1BB.type.name + ", Program: " + program1BB.program);
		System.out.println("Remaining # of seats= " + program1BB.vacantSeat());
		System.out.println("Current Income= " + program1BB.income());
		System.out.println("Expected Maximum Income= " + program1BB.expectedIncome());				

		program1BB.vacantSeat();
		assertThat(program1BB.vacantSeat(), is(98));
		assertThat(program1BB.income(), is(100000));
		assertThat(program1BB.expectedIncome(), is(160000));
		verify(cm2, atLeast(1)).doubleFor1();
		verify(cm2, atMost(3)).doubleFor1();
		verify(cm2, times(3)).doubleFor1();
//		verify(cm2, never()).doubleFor1();
	}
	
}

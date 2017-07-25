package tfl_system;

public class AllZonesClass {
		
	public String travelMessage, travelPrice;
                 private final double PeakPrice = 0.50;                                 //=========== Unchangeable peak time price
	
	public AllZonesClass(){
		//---------------------------------CLOCK
		ClockClass cc = new ClockClass();                    //=========== Calling the time class
		cc.Peak_Time();

		//--------------------------------Enter/Exit
		EntryExitClass ee = new EntryExitClass();           //========== Calling the E/E class

		//------------------------------Stations
		StationsClass ss = new StationsClass();               //========== Calling the stations class

		//------------------------------Prices
		PricesClass pc = new PricesClass();                     //========== Calling the prices class
        
		
	if (ee.Entry() == ee.Exit()){
		System.out.println("\nYou entered and exited in the same station ("+ss.stations[ee.Entry()]+"). You will do not pay.");
	} else {
		

		if (ee.Entry() >= 1 && ee.Entry() <= 91){		//entry in zone 1
			
			if (ee.Exit() >= 1 && ee.Exit() <= 91){		//exit in zone 1
		
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 1 and exited in "+ss.stations[ee.Exit()]+", Zone 1";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_1_1 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_1_1+"0";
				}
					
			}
			
			
			if (ee.Exit() >= 92 && ee.Exit() <= 278){		//exit in zone 2
				
                                                                    travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 1 and exited in "+ss.stations[ee.Exit()]+", Zone 2";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_1_2 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_1_2+"0";
				}
					
					
	
			}
		
			if (ee.Exit() >= 279 && ee.Exit() <= 412){		//exit in zone 3
			
                                                                     travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 1 and exited in "+ss.stations[ee.Exit()]+", Zone 3";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_1_3 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_1_3+"0";
				}
			}
			
			
			
			if (ee.Exit() >= 413 && ee.Exit() <= 540){		//exit in zone 4
				
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 1 and exited in "+ss.stations[ee.Exit()]+", Zone 4";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_1_4 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_1_4+"0";
				}
			}
		
			
			
			if (ee.Exit() >= 541 && ee.Exit() <= 611){		//exit in zone 5
				
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 1 and exited in "+ss.stations[ee.Exit()]+", Zone 5";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_1_5 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_1_5+"0";
				}
			}		
		
			
			if (ee.Exit() >= 612 && ee.Exit() <= 692){		//exit in zone 6
				
                                                                     travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 1 and exited in "+ss.stations[ee.Exit()]+", Zone 6";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_1_6 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_1_6+"0";
				}
			}
			
			
			if (ee.Exit() >= 693 && ee.Exit() <= 703){		//exit in zone 7
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 1 and exited in "+ss.stations[ee.Exit()]+", Zone 7";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_1_7 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_1_7+"0";
				}
			}
			
			
			if (ee.Exit() >= 704 && ee.Exit() <= 711){		//exit in zone 8
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 1 and exited in "+ss.stations[ee.Exit()]+", Zone 8";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_1_8 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_1_8+"0";
				}
			}
			
			
			if (ee.Exit() >= 712 && ee.Exit() <= 714){		//exit in zone 9
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 1 and exited in "+ss.stations[ee.Exit()]+", Zone 9";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_1_9 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_1_9+"0";
				}
                                                    }
			
			
			
			
			if (ee.Exit() >= 715 && ee.Exit() <= 719){		//exit in zone B
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 1 and exited in "+ss.stations[ee.Exit()]+", Zone B";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_1_B + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_1_B+"0";
				}	
			}
			
			
			if (ee.Exit() >= 720 && ee.Exit() <= 721){		//exit in zone C
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 1 and exited in "+ss.stations[ee.Exit()]+", Zone C";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_1_C + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_1_C+"0";
				}	
			}
			
			
			
			if (ee.Exit() >= 722 && ee.Exit() <= 725){		//exit in zone G
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 1 and exited in "+ss.stations[ee.Exit()]+", Zone G";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_1_G+ PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_1_G+"0";
				}	
			}
			
			
			if (ee.Exit() >= 726 && ee.Exit() <= 728){		//exit in zone W
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 1 and exited in "+ss.stations[ee.Exit()]+", Zone W";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_1_W + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_1_W+"0";
				}		
	}
                }
                if (ee.Entry() >= 92 && ee.Entry() <= 278){		//entry in zone 2
			
			if (ee.Exit() >= 1 && ee.Exit() <= 91){		//exit in zone 1
		
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 2 and exited in "+ss.stations[ee.Exit()]+", Zone 1";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_1_2 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_1_2+"0";
				}
					
			}
			
			
			if (ee.Exit() >= 92 && ee.Exit() <= 278){		//exit in zone 2
				
                                                                    travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 2 and exited in "+ss.stations[ee.Exit()]+", Zone 2";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_2_2 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_2_2+"0";
				}
					
					
	
			}
		
			if (ee.Exit() >= 279 && ee.Exit() <= 412){		//exit in zone 3
			
                                                                     travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 2 and exited in "+ss.stations[ee.Exit()]+", Zone 3";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_2_3 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_2_3+"0";
				}
			}
			
			
			
			if (ee.Exit() >= 413 && ee.Exit() <= 540){		//exit in zone 4
				
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 2 and exited in "+ss.stations[ee.Exit()]+", Zone 4";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_2_4 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_2_4+"0";
				}
			}
		
			
			
			if (ee.Exit() >= 541 && ee.Exit() <= 611){		//exit in zone 5
				
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 2 and exited in "+ss.stations[ee.Exit()]+", Zone 5";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_2_5 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_2_5+"0";
				}
			}		
		
			
			if (ee.Exit() >= 612 && ee.Exit() <= 692){		//exit in zone 6
				
                                                                     travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 2 and exited in "+ss.stations[ee.Exit()]+", Zone 6";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_2_6 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_2_6+"0";
				}
			}
			
			
			if (ee.Exit() >= 693 && ee.Exit() <= 703){		//exit in zone 7
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 2 and exited in "+ss.stations[ee.Exit()]+", Zone 7";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_2_7 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_2_7+"0";
				}
			}
			
			
			if (ee.Exit() >= 704 && ee.Exit() <= 711){		//exit in zone 8
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 2 and exited in "+ss.stations[ee.Exit()]+", Zone 8";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_2_8 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_2_8+"0";
				}
			}
			
			
			if (ee.Exit() >= 712 && ee.Exit() <= 714){		//exit in zone 9
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 2 and exited in "+ss.stations[ee.Exit()]+", Zone 9";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_2_9 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_2_9+"0";
				}
			
			
			
			
			if (ee.Exit() >= 715 && ee.Exit() <= 719){		//exit in zone B
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 2 and exited in "+ss.stations[ee.Exit()]+", Zone B";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_2_B + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_2_B+"0";
				}	
			}
			
			
			if (ee.Exit() >= 720 && ee.Exit() <= 721){		//exit in zone C
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 2 and exited in "+ss.stations[ee.Exit()]+", Zone C";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_2_C + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_2_C+"0";
				}	
			}
			
			
			
			if (ee.Exit() >= 722 && ee.Exit() <= 725){		//exit in zone G
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 2 and exited in "+ss.stations[ee.Exit()]+", Zone G";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_2_G+ PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_2_G+"0";
				}	
			}
			
			
			if (ee.Exit() >= 726 && ee.Exit() <= 728){		//exit in zone W
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 2 and exited in "+ss.stations[ee.Exit()]+", Zone W";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_2_W + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_2_W+"0";
				}	
			}	
	}
                }
                
                if (ee.Entry() >= 279 && ee.Entry() <= 412){		//entry in zone 3
			
			if (ee.Exit() >= 1 && ee.Exit() <= 91){		//exit in zone 1
		
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 3 and exited in "+ss.stations[ee.Exit()]+", Zone 1";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_1_3 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_1_3+"0";
				}
					
			}
			
			
			if (ee.Exit() >= 92 && ee.Exit() <= 278){		//exit in zone 2
				
                                                                    travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 3 and exited in "+ss.stations[ee.Exit()]+", Zone 2";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_2_3 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_2_3+"0";
				}
					
					
	
			}
		
			if (ee.Exit() >= 279 && ee.Exit() <= 412){		//exit in zone 3
			
                                                                     travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 3 and exited in "+ss.stations[ee.Exit()]+", Zone 3";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_3_3 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_3_3+"0";
				}
			}
			
			
			
			if (ee.Exit() >= 413 && ee.Exit() <= 540){		//exit in zone 4
				
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 3 and exited in "+ss.stations[ee.Exit()]+", Zone 4";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_3_4 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_3_4+"0";
				}
			}
		
			
			
			if (ee.Exit() >= 541 && ee.Exit() <= 611){		//exit in zone 5
				
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 3 and exited in "+ss.stations[ee.Exit()]+", Zone 5";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_3_5 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_3_5+"0";
				}
			}		
		
			
			if (ee.Exit() >= 612 && ee.Exit() <= 692){		//exit in zone 6
				
                                                                     travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 3 and exited in "+ss.stations[ee.Exit()]+", Zone 6";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_3_6 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_3_6+"0";
				}
			}
			
			
			if (ee.Exit() >= 693 && ee.Exit() <= 703){		//exit in zone 7
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 3 and exited in "+ss.stations[ee.Exit()]+", Zone 7";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_3_7 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_3_7+"0";
				}
			}
			
			
			if (ee.Exit() >= 704 && ee.Exit() <= 711){		//exit in zone 8
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 3 and exited in "+ss.stations[ee.Exit()]+", Zone 8";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_3_8 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_3_8+"0";
				}
			}
			
			
			if (ee.Exit() >= 712 && ee.Exit() <= 714){		//exit in zone 9
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 3 and exited in "+ss.stations[ee.Exit()]+", Zone 9";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_3_9 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_3_9+"0";
				}
                                                    }
			
			
			
			if (ee.Exit() >= 715 && ee.Exit() <= 719){		//exit in zone B
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 3 and exited in "+ss.stations[ee.Exit()]+", Zone B";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_3_B + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_3_B+"0";
				}	
			}
			
			
			if (ee.Exit() >= 720 && ee.Exit() <= 721){		//exit in zone C
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 3 and exited in "+ss.stations[ee.Exit()]+", Zone C";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_3_C + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_3_C+"0";
				}	
			}
			
			
			
			if (ee.Exit() >= 722 && ee.Exit() <= 725){		//exit in zone G
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 3 and exited in "+ss.stations[ee.Exit()]+", Zone G";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_3_G+ PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_3_G+"0";
				}	
			}
			
			
			if (ee.Exit() >= 726 && ee.Exit() <= 728){		//exit in zone W
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 3 and exited in "+ss.stations[ee.Exit()]+", Zone W";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_3_W + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_3_W+"0";
				}		
	}
               }
                
                
                
                
                if (ee.Entry() >= 413 && ee.Entry() <= 540){		//entry in zone 4
			
			if (ee.Exit() >= 1 && ee.Exit() <= 91){		//exit in zone 1
		
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 4 and exited in "+ss.stations[ee.Exit()]+", Zone 1";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_1_4 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_1_4+"0";
				}
					
			}
			
			
			if (ee.Exit() >= 92 && ee.Exit() <= 278){		//exit in zone 2
				
                                                                    travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 4 and exited in "+ss.stations[ee.Exit()]+", Zone 2";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_2_4 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_2_4+"0";
				}
					
					
	
			}
		
			if (ee.Exit() >= 279 && ee.Exit() <= 412){		//exit in zone 3
			
                                                                     travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 4 and exited in "+ss.stations[ee.Exit()]+", Zone 3";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_3_4 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_3_4+"0";
				}
			}
			
			
			
			if (ee.Exit() >= 413 && ee.Exit() <= 540){		//exit in zone 4
				
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 4 and exited in "+ss.stations[ee.Exit()]+", Zone 4";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_4_4 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_4_4+"0";
				}
			}
		
			
			
			if (ee.Exit() >= 541 && ee.Exit() <= 611){		//exit in zone 5
				
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 4 and exited in "+ss.stations[ee.Exit()]+", Zone 5";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_4_5 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_4_5+"0";
				}
			}		
		
			
			if (ee.Exit() >= 612 && ee.Exit() <= 692){		//exit in zone 6
				
                                                                     travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 4 and exited in "+ss.stations[ee.Exit()]+", Zone 6";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_4_6 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_4_6+"0";
				}
			}
			
			
			if (ee.Exit() >= 693 && ee.Exit() <= 703){		//exit in zone 7
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 4 and exited in "+ss.stations[ee.Exit()]+", Zone 7";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_4_7 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_4_7+"0";
				}
			}
			
			
			if (ee.Exit() >= 704 && ee.Exit() <= 711){		//exit in zone 8
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 4 and exited in "+ss.stations[ee.Exit()]+", Zone 8";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_4_8 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_4_8+"0";
				}
			}
			
			
			if (ee.Exit() >= 712 && ee.Exit() <= 714){		//exit in zone 9
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 4 and exited in "+ss.stations[ee.Exit()]+", Zone 9";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_4_9 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_4_9+"0";
				}
                                                    }
			
			
			
			if (ee.Exit() >= 715 && ee.Exit() <= 719){		//exit in zone B
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 4 and exited in "+ss.stations[ee.Exit()]+", Zone B";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_4_B + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_4_B+"0";
				}	
			}
			
			
			if (ee.Exit() >= 720 && ee.Exit() <= 721){		//exit in zone C
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 4 and exited in "+ss.stations[ee.Exit()]+", Zone C";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_4_C + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_4_C+"0";
				}	
			}
			
			
			
			if (ee.Exit() >= 722 && ee.Exit() <= 725){		//exit in zone G
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 4 and exited in "+ss.stations[ee.Exit()]+", Zone G";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_4_G+ PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_4_G+"0";
				}	
			}
			
			
			if (ee.Exit() >= 726 && ee.Exit() <= 728){		//exit in zone W
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 4 and exited in "+ss.stations[ee.Exit()]+", Zone W";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_4_W + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_4_W+"0";
				}		
	}
               }
                

                
               if (ee.Entry() >= 541 && ee.Entry() <= 611){		//entry in zone 5
			
			if (ee.Exit() >= 1 && ee.Exit() <= 91){		//exit in zone 1
		
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 5 and exited in "+ss.stations[ee.Exit()]+", Zone 1";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_1_5 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_1_5+"0";
				}
					
			}
			
			
			if (ee.Exit() >= 92 && ee.Exit() <= 278){		//exit in zone 2
				
                                                                    travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 5 and exited in "+ss.stations[ee.Exit()]+", Zone 2";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_2_5 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_2_5+"0";
				}
					
					
	
			}
		
			if (ee.Exit() >= 279 && ee.Exit() <= 412){		//exit in zone 3
			
                                                                     travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 5 and exited in "+ss.stations[ee.Exit()]+", Zone 3";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_3_5 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_3_5+"0";
				}
			}
			
			
			
			if (ee.Exit() >= 413 && ee.Exit() <= 540){		//exit in zone 4
				
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 5 and exited in "+ss.stations[ee.Exit()]+", Zone 4";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_4_5 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_4_5+"0";
				}
			}
		
			
			
			if (ee.Exit() >= 541 && ee.Exit() <= 611){		//exit in zone 5
				
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 5 and exited in "+ss.stations[ee.Exit()]+", Zone 5";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_5_5 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_5_5+"0";
				}
			}		
		
			
			if (ee.Exit() >= 612 && ee.Exit() <= 692){		//exit in zone 6
				
                                                                     travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 5 and exited in "+ss.stations[ee.Exit()]+", Zone 6";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_5_6 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_5_6+"0";
				}
			}
			
			
			if (ee.Exit() >= 693 && ee.Exit() <= 703){		//exit in zone 7
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 5 and exited in "+ss.stations[ee.Exit()]+", Zone 7";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_5_7 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_5_7+"0";
				}
			}
			
			
			if (ee.Exit() >= 704 && ee.Exit() <= 711){		//exit in zone 8
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 5 and exited in "+ss.stations[ee.Exit()]+", Zone 8";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_5_8 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_5_8+"0";
				}
			}
			
			
			if (ee.Exit() >= 712 && ee.Exit() <= 714){		//exit in zone 9
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 5 and exited in "+ss.stations[ee.Exit()]+", Zone 9";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_5_9 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_5_9+"0";
				}
                                                    }
			
			
			
			if (ee.Exit() >= 715 && ee.Exit() <= 719){		//exit in zone B
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 5 and exited in "+ss.stations[ee.Exit()]+", Zone B";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_5_B + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_5_B+"0";
				}	
			}
			
			
			if (ee.Exit() >= 720 && ee.Exit() <= 721){		//exit in zone C
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 5 and exited in "+ss.stations[ee.Exit()]+", Zone C";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_5_C + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_5_C+"0";
				}	
			}
			
			
			
			if (ee.Exit() >= 722 && ee.Exit() <= 725){		//exit in zone G
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 5 and exited in "+ss.stations[ee.Exit()]+", Zone G";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_5_G+ PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_5_G+"0";
				}	
			}
			
			
			if (ee.Exit() >= 726 && ee.Exit() <= 728){		//exit in zone W
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 5 and exited in "+ss.stations[ee.Exit()]+", Zone W";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_5_W + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_5_W+"0";
				}		
	}
               }
                
               
                              if (ee.Entry() >= 612 && ee.Entry() <= 692){		//entry in zone 6
			
			if (ee.Exit() >= 1 && ee.Exit() <= 91){		//exit in zone 1
		
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 6 and exited in "+ss.stations[ee.Exit()]+", Zone 1";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_1_6 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_1_6+"0";
				}
					
			}
			
			
			if (ee.Exit() >= 92 && ee.Exit() <= 278){		//exit in zone 2
				
                                                                    travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 6 and exited in "+ss.stations[ee.Exit()]+", Zone 2";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_2_6 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_2_6+"0";
				}
					
					
	
			}
		
			if (ee.Exit() >= 279 && ee.Exit() <= 412){		//exit in zone 3
			
                                                                     travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 6 and exited in "+ss.stations[ee.Exit()]+", Zone 3";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_3_6 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_3_6+"0";
				}
			}
			
			
			
			if (ee.Exit() >= 413 && ee.Exit() <= 540){		//exit in zone 4
				
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 6 and exited in "+ss.stations[ee.Exit()]+", Zone 4";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_4_6 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_4_6+"0";
				}
			}
		
			
			
			if (ee.Exit() >= 541 && ee.Exit() <= 611){		//exit in zone 5
				
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 6 and exited in "+ss.stations[ee.Exit()]+", Zone 5";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_5_6 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_5_6+"0";
				}
			}		
		
			
			if (ee.Exit() >= 612 && ee.Exit() <= 692){		//exit in zone 6
				
                                                                     travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 6 and exited in "+ss.stations[ee.Exit()]+", Zone 6";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_6_6 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_6_6+"0";
				}
			}
			
			
			if (ee.Exit() >= 693 && ee.Exit() <= 703){		//exit in zone 7
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 6 and exited in "+ss.stations[ee.Exit()]+", Zone 7";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_6_7 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_6_7+"0";
				}
			}
			
			
			if (ee.Exit() >= 704 && ee.Exit() <= 711){		//exit in zone 8
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 6 and exited in "+ss.stations[ee.Exit()]+", Zone 8";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_6_8 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_6_8+"0";
				}
			}
			
			
			if (ee.Exit() >= 712 && ee.Exit() <= 714){		//exit in zone 9
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 6 and exited in "+ss.stations[ee.Exit()]+", Zone 9";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_6_9 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_6_9+"0";
				}
                                                    }
			
			
			
			if (ee.Exit() >= 715 && ee.Exit() <= 719){		//exit in zone B
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 6 and exited in "+ss.stations[ee.Exit()]+", Zone B";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_6_B + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_6_B+"0";
				}	
			}
			
			
			if (ee.Exit() >= 720 && ee.Exit() <= 721){		//exit in zone C
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 6 and exited in "+ss.stations[ee.Exit()]+", Zone C";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_6_C + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_6_C+"0";
				}	
			}
			
			
			
			if (ee.Exit() >= 722 && ee.Exit() <= 725){		//exit in zone G
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 6 and exited in "+ss.stations[ee.Exit()]+", Zone G";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_6_G+ PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_6_G+"0";
				}	
			}
			
			
			if (ee.Exit() >= 726 && ee.Exit() <= 728){		//exit in zone W
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 6 and exited in "+ss.stations[ee.Exit()]+", Zone W";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_6_W + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_6_W+"0";
				}		
	}
               }
                
                
                  if (ee.Entry() >= 693 && ee.Entry() <= 703){		//entry in zone 7
			
			if (ee.Exit() >= 1 && ee.Exit() <= 91){		//exit in zone 1
		
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 7 and exited in "+ss.stations[ee.Exit()]+", Zone 1";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_1_7 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_1_7 +"0";
				}
					
			}
			
			
			if (ee.Exit() >= 92 && ee.Exit() <= 278){		//exit in zone 2
				
                                                                    travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 7 and exited in "+ss.stations[ee.Exit()]+", Zone 2";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_2_7 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_2_7+"0";
				}
					
					
	
			}
		
			if (ee.Exit() >= 279 && ee.Exit() <= 412){		//exit in zone 3
			
                                                                     travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 7 and exited in "+ss.stations[ee.Exit()]+", Zone 3";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_3_7 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_3_7+"0";
				}
			}
			
			
			
			if (ee.Exit() >= 413 && ee.Exit() <= 540){		//exit in zone 4
				
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 7 and exited in "+ss.stations[ee.Exit()]+", Zone 4";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_4_7 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_4_7+"0";
				}
			}
		
			
			
			if (ee.Exit() >= 541 && ee.Exit() <= 611){		//exit in zone 5
				
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 7 and exited in "+ss.stations[ee.Exit()]+", Zone 5";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_5_7 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_5_7+"0";
				}
			}		
		
			
			if (ee.Exit() >= 612 && ee.Exit() <= 692){		//exit in zone 6
				
                                                                     travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 7 and exited in "+ss.stations[ee.Exit()]+", Zone 6";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_6_7 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_6_7+"0";
				}
			}
			
			
			if (ee.Exit() >= 693 && ee.Exit() <= 703){		//exit in zone 7
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 7 and exited in "+ss.stations[ee.Exit()]+", Zone 7";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_7_7 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_7_7+"0";
				}
			}
			
			
			if (ee.Exit() >= 704 && ee.Exit() <= 711){		//exit in zone 8
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 7 and exited in "+ss.stations[ee.Exit()]+", Zone 8";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_7_8 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_7_8+"0";
				}
			}
			
			
			if (ee.Exit() >= 712 && ee.Exit() <= 714){		//exit in zone 9
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 7 and exited in "+ss.stations[ee.Exit()]+", Zone 9";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_7_9 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_7_9+"0";
				}
                                                    }
			
			
			
			if (ee.Exit() >= 715 && ee.Exit() <= 719){		//exit in zone B
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 7 and exited in "+ss.stations[ee.Exit()]+", Zone B";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_7_B + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_7_B+"0";
				}	
			}
			
			
			if (ee.Exit() >= 720 && ee.Exit() <= 721){		//exit in zone C
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 7 and exited in "+ss.stations[ee.Exit()]+", Zone C";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_7_C + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_7_C+"0";
				}	
			}
			
			
			
			if (ee.Exit() >= 722 && ee.Exit() <= 725){		//exit in zone G
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 7 and exited in "+ss.stations[ee.Exit()]+", Zone G";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_7_G+ PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_7_G+"0";
				}	
			}
			
			
			if (ee.Exit() >= 726 && ee.Exit() <= 728){		//exit in zone W
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 7 and exited in "+ss.stations[ee.Exit()]+", Zone W";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_7_W + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_7_W+"0";
				}		
	}
               }
                              
                              
                  
                  
                  if (ee.Entry() >= 704 && ee.Entry() <= 711){		//entry in zone 8
			
			if (ee.Exit() >= 1 && ee.Exit() <= 91){		//exit in zone 1
		
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 8 and exited in "+ss.stations[ee.Exit()]+", Zone 1";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_1_8 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_1_8 +"0";
				}
					
			}
			
			
			if (ee.Exit() >= 92 && ee.Exit() <= 278){		//exit in zone 2
				
                                                                    travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 8 and exited in "+ss.stations[ee.Exit()]+", Zone 2";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_2_8 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_2_8+"0";
				}
					
					
	
			}
		
			if (ee.Exit() >= 279 && ee.Exit() <= 412){		//exit in zone 3
			
                                                                     travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 8 and exited in "+ss.stations[ee.Exit()]+", Zone 3";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_3_8 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_3_8+"0";
				}
			}
			
			
			
			if (ee.Exit() >= 413 && ee.Exit() <= 540){		//exit in zone 4
				
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 8 and exited in "+ss.stations[ee.Exit()]+", Zone 4";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_4_8 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_4_8+"0";
				}
			}
		
			
			
			if (ee.Exit() >= 541 && ee.Exit() <= 611){		//exit in zone 5
				
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 8 and exited in "+ss.stations[ee.Exit()]+", Zone 5";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_5_8 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_5_8+"0";
				}
			}		
		
			
			if (ee.Exit() >= 612 && ee.Exit() <= 692){		//exit in zone 6
				
                                                                     travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 8 and exited in "+ss.stations[ee.Exit()]+", Zone 6";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_6_8 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_6_8+"0";
				}
			}
			
			
			if (ee.Exit() >= 693 && ee.Exit() <= 703){		//exit in zone 7
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 8 and exited in "+ss.stations[ee.Exit()]+", Zone 7";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_7_8 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_7_8+"0";
				}
			}
			
			
			if (ee.Exit() >= 704 && ee.Exit() <= 711){		//exit in zone 8
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 8 and exited in "+ss.stations[ee.Exit()]+", Zone 8";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_8_8 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_8_8+"0";
				}
			}
			
			
			if (ee.Exit() >= 712 && ee.Exit() <= 714){		//exit in zone 9
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 8 and exited in "+ss.stations[ee.Exit()]+", Zone 9";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_8_9 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_8_9+"0";
				}
                                                    }
			
			
			
			if (ee.Exit() >= 715 && ee.Exit() <= 719){		//exit in zone B
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 8 and exited in "+ss.stations[ee.Exit()]+", Zone B";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_8_B + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_8_B+"0";
				}	
			}
			
			
			if (ee.Exit() >= 720 && ee.Exit() <= 721){		//exit in zone C
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 8 and exited in "+ss.stations[ee.Exit()]+", Zone C";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_8_C + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_8_C+"0";
				}	
			}
			
			
			
			if (ee.Exit() >= 722 && ee.Exit() <= 725){		//exit in zone G
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 8 and exited in "+ss.stations[ee.Exit()]+", Zone G";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_8_G+ PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_8_G+"0";
				}	
			}
			
			
			if (ee.Exit() >= 726 && ee.Exit() <= 728){		//exit in zone W
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 8 and exited in "+ss.stations[ee.Exit()]+", Zone W";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_8_W + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_8_W+"0";
				}		
	}
               }
                  
                  
                  if (ee.Entry() >= 712 && ee.Entry() <= 714){		//entry in zone 9
			
			if (ee.Exit() >= 1 && ee.Exit() <= 91){		//exit in zone 1
		
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 9 and exited in "+ss.stations[ee.Exit()]+", Zone 1";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_1_9 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_1_9 +"0";
				}
					
			}
			
			
			if (ee.Exit() >= 92 && ee.Exit() <= 278){		//exit in zone 2
				
                                                                    travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 9 and exited in "+ss.stations[ee.Exit()]+", Zone 2";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_2_9 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_2_9+"0";
				}
					
					
	
			}
		
			if (ee.Exit() >= 279 && ee.Exit() <= 412){		//exit in zone 3
			
                                                                     travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 9 and exited in "+ss.stations[ee.Exit()]+", Zone 3";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_3_9 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_3_9+"0";
				}
			}
			
			
			
			if (ee.Exit() >= 413 && ee.Exit() <= 540){		//exit in zone 4
				
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 9 and exited in "+ss.stations[ee.Exit()]+", Zone 4";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_4_9 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_4_9+"0";
				}
			}
		
			
			
			if (ee.Exit() >= 541 && ee.Exit() <= 611){		//exit in zone 5
				
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 9 and exited in "+ss.stations[ee.Exit()]+", Zone 5";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_5_9 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_5_9+"0";
				}
			}		
		
			
			if (ee.Exit() >= 612 && ee.Exit() <= 692){		//exit in zone 6
				
                                                                     travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 9 and exited in "+ss.stations[ee.Exit()]+", Zone 6";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_6_9 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_6_9+"0";
				}
			}
			
			
			if (ee.Exit() >= 693 && ee.Exit() <= 703){		//exit in zone 7
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 9 and exited in "+ss.stations[ee.Exit()]+", Zone 7";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_7_9 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_7_9+"0";
				}
			}
			
			
			if (ee.Exit() >= 704 && ee.Exit() <= 711){		//exit in zone 8
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 9 and exited in "+ss.stations[ee.Exit()]+", Zone 8";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_8_9 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_8_9+"0";
				}
			}
			
			
			if (ee.Exit() >= 712 && ee.Exit() <= 714){		//exit in zone 9
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 9 and exited in "+ss.stations[ee.Exit()]+", Zone 9";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_9_9 + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_9_9+"0";
				}
                                                    }
			
			
			
			if (ee.Exit() >= 715 && ee.Exit() <= 719){		//exit in zone B
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 9 and exited in "+ss.stations[ee.Exit()]+", Zone B";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_9_B + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_9_B+"0";
				}	
			}
			
			
			if (ee.Exit() >= 720 && ee.Exit() <= 721){		//exit in zone C
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 9 and exited in "+ss.stations[ee.Exit()]+", Zone C";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_9_C + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_9_C+"0";
				}	
			}
			
			
			
			if (ee.Exit() >= 722 && ee.Exit() <= 725){		//exit in zone G
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 9 and exited in "+ss.stations[ee.Exit()]+", Zone G";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_9_G+ PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_9_G+"0";
				}	
			}
			
			
			if (ee.Exit() >= 726 && ee.Exit() <= 728){		//exit in zone W
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone 9 and exited in "+ss.stations[ee.Exit()]+", Zone W";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_9_W + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_9_W+"0";
				}		
	}
               }
                  
                  
                  
                  if (ee.Entry() >= 715 && ee.Entry() <= 719){		//entry in zone B
			
			if (ee.Exit() >= 1 && ee.Exit() <= 91){		//exit in zone 1
		
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone B and exited in "+ss.stations[ee.Exit()]+", Zone 1";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_1_B + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_1_B +"0";
				}
					
			}
			
			
			if (ee.Exit() >= 92 && ee.Exit() <= 278){		//exit in zone 2
				
                                                                    travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone B and exited in "+ss.stations[ee.Exit()]+", Zone 2";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_2_B + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_2_B+"0";
				}
					
					
	
			}
		
			if (ee.Exit() >= 279 && ee.Exit() <= 412){		//exit in zone 3
			
                                                                     travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone B and exited in "+ss.stations[ee.Exit()]+", Zone 3";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_3_B + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_3_B+"0";
				}
			}
			
			
			
			if (ee.Exit() >= 413 && ee.Exit() <= 540){		//exit in zone 4
				
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone B and exited in "+ss.stations[ee.Exit()]+", Zone 4";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_4_B + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_4_B+"0";
				}
			}
		
			
			
			if (ee.Exit() >= 541 && ee.Exit() <= 611){		//exit in zone 5
				
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone B and exited in "+ss.stations[ee.Exit()]+", Zone 5";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_5_B + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_5_B+"0";
				}
			}		
		
			
			if (ee.Exit() >= 612 && ee.Exit() <= 692){		//exit in zone 6
				
                                                                     travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone B and exited in "+ss.stations[ee.Exit()]+", Zone 6";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_6_B + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_6_B+"0";
				}
			}
			
			
			if (ee.Exit() >= 693 && ee.Exit() <= 703){		//exit in zone 7
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone B and exited in "+ss.stations[ee.Exit()]+", Zone 7";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_7_B + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_7_B+"0";
				}
			}
			
			
			if (ee.Exit() >= 704 && ee.Exit() <= 711){		//exit in zone 8
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone B and exited in "+ss.stations[ee.Exit()]+", Zone 8";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_8_B + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_8_B+"0";
				}
			}
			
			
			if (ee.Exit() >= 712 && ee.Exit() <= 714){		//exit in zone 9
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone B and exited in "+ss.stations[ee.Exit()]+", Zone 9";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_9_B + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_9_B+"0";
				}
                                                    }
			
			
			
			if (ee.Exit() >= 715 && ee.Exit() <= 719){		//exit in zone B
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone B and exited in "+ss.stations[ee.Exit()]+", Zone B";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_B_B + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_B_B+"0";
				}	
			}
			
			
			if (ee.Exit() >= 720 && ee.Exit() <= 721){		//exit in zone C
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone B and exited in "+ss.stations[ee.Exit()]+", Zone C";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_B_C + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_B_C+"0";
				}	
			}
			
			
			
			if (ee.Exit() >= 722 && ee.Exit() <= 725){		//exit in zone G
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone B and exited in "+ss.stations[ee.Exit()]+", Zone G";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_B_G+ PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_B_G+"0";
				}	
			}
			
			
			if (ee.Exit() >= 726 && ee.Exit() <= 728){		//exit in zone W
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone B and exited in "+ss.stations[ee.Exit()]+", Zone W";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_B_W + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_B_W+"0";
				}		
	}
               }
                  
                  
                  if (ee.Entry() >= 720 && ee.Entry() <= 721){		//entry in zone C
			
			if (ee.Exit() >= 1 && ee.Exit() <= 91){		//exit in zone 1
		
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone C and exited in "+ss.stations[ee.Exit()]+", Zone 1";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_1_C + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_1_C +"0";
				}
					
			}
			
			
			if (ee.Exit() >= 92 && ee.Exit() <= 278){		//exit in zone 2
				
                                                                    travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone C and exited in "+ss.stations[ee.Exit()]+", Zone 2";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_2_C + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_2_C+"0";
				}
					
					
	
			}
		
			if (ee.Exit() >= 279 && ee.Exit() <= 412){		//exit in zone 3
			
                                                                     travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone C and exited in "+ss.stations[ee.Exit()]+", Zone 3";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_3_C + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_3_C+"0";
				}
			}
			
			
			
			if (ee.Exit() >= 413 && ee.Exit() <= 540){		//exit in zone 4
				
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone C and exited in "+ss.stations[ee.Exit()]+", Zone 4";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_4_C + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_4_C+"0";
				}
			}
		
			
			
			if (ee.Exit() >= 541 && ee.Exit() <= 611){		//exit in zone 5
				
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone C and exited in "+ss.stations[ee.Exit()]+", Zone 5";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_5_C + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_5_C+"0";
				}
			}		
		
			
			if (ee.Exit() >= 612 && ee.Exit() <= 692){		//exit in zone 6
				
                                                                     travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone C and exited in "+ss.stations[ee.Exit()]+", Zone 6";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_6_C + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_6_C+"0";
				}
			}
			
			
			if (ee.Exit() >= 693 && ee.Exit() <= 703){		//exit in zone 7
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone C and exited in "+ss.stations[ee.Exit()]+", Zone 7";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_7_C + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_7_C+"0";
				}
			}
			
			
			if (ee.Exit() >= 704 && ee.Exit() <= 711){		//exit in zone 8
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone C and exited in "+ss.stations[ee.Exit()]+", Zone 8";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_8_C + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_8_C+"0";
				}
			}
			
			
			if (ee.Exit() >= 712 && ee.Exit() <= 714){		//exit in zone 9
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone C and exited in "+ss.stations[ee.Exit()]+", Zone 9";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_9_C + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_9_C+"0";
				}
                                                    }
			
			
			
			if (ee.Exit() >= 715 && ee.Exit() <= 719){		//exit in zone B
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone C and exited in "+ss.stations[ee.Exit()]+", Zone B";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_B_C + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_B_C+"0";
				}	
			}
			
			
			if (ee.Exit() >= 720 && ee.Exit() <= 721){		//exit in zone C
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone C and exited in "+ss.stations[ee.Exit()]+", Zone C";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_C_C + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_C_C+"0";
				}	
			}
			
			
			
			if (ee.Exit() >= 722 && ee.Exit() <= 725){		//exit in zone G
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone C and exited in "+ss.stations[ee.Exit()]+", Zone G";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_C_G+ PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_C_G+"0";
				}	
			}
			
			
			if (ee.Exit() >= 726 && ee.Exit() <= 728){		//exit in zone W
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone C and exited in "+ss.stations[ee.Exit()]+", Zone W";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_C_W + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_C_W+"0";
				}		
	}
               }
                       
                  
                  if (ee.Entry() >= 722 && ee.Entry() <= 725){		//entry in zone G
			
			if (ee.Exit() >= 1 && ee.Exit() <= 91){		//exit in zone 1
		
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone G and exited in "+ss.stations[ee.Exit()]+", Zone 1";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_1_G + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_1_G +"0";
				}
					
			}
			
			
			if (ee.Exit() >= 92 && ee.Exit() <= 278){		//exit in zone 2
				
                                                                    travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone G and exited in "+ss.stations[ee.Exit()]+", Zone 2";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_2_G + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_2_G+"0";
				}
					
					
	
			}
		
			if (ee.Exit() >= 279 && ee.Exit() <= 412){		//exit in zone 3
			
                                                                     travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone G and exited in "+ss.stations[ee.Exit()]+", Zone 3";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_3_G + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_3_G+"0";
				}
			}
			
			
			
			if (ee.Exit() >= 413 && ee.Exit() <= 540){		//exit in zone 4
				
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone G and exited in "+ss.stations[ee.Exit()]+", Zone 4";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_4_G + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_4_G+"0";
				}
			}
		
			
			
			if (ee.Exit() >= 541 && ee.Exit() <= 611){		//exit in zone 5
				
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone G and exited in "+ss.stations[ee.Exit()]+", Zone 5";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_5_G + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_5_G+"0";
				}
			}		
		
			
			if (ee.Exit() >= 612 && ee.Exit() <= 692){		//exit in zone 6
				
                                                                     travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone G and exited in "+ss.stations[ee.Exit()]+", Zone 6";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_6_G + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_6_G+"0";
				}
			}
			
			
			if (ee.Exit() >= 693 && ee.Exit() <= 703){		//exit in zone 7
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone G and exited in "+ss.stations[ee.Exit()]+", Zone 7";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_7_G + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_7_G+"0";
				}
			}
			
			
			if (ee.Exit() >= 704 && ee.Exit() <= 711){		//exit in zone 8
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone G and exited in "+ss.stations[ee.Exit()]+", Zone 8";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_8_G + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_8_G+"0";
				}
			}
			
			
			if (ee.Exit() >= 712 && ee.Exit() <= 714){		//exit in zone 9
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone G and exited in "+ss.stations[ee.Exit()]+", Zone 9";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_9_G + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_9_G+"0";
				}
                                                    }
			
			
			
			if (ee.Exit() >= 715 && ee.Exit() <= 719){		//exit in zone B
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone G and exited in "+ss.stations[ee.Exit()]+", Zone B";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_B_G + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_B_G+"0";
				}	
			}
			
			
			if (ee.Exit() >= 720 && ee.Exit() <= 721){		//exit in zone C
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone G and exited in "+ss.stations[ee.Exit()]+", Zone C";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_C_G + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_C_G+"0";
				}	
			}
			
			
			
			if (ee.Exit() >= 722 && ee.Exit() <= 725){		//exit in zone G
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone G and exited in "+ss.stations[ee.Exit()]+", Zone G";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_G_G+ PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_G_G+"0";
				}	
			}
			
			
			if (ee.Exit() >= 726 && ee.Exit() <= 728){		//exit in zone W
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone G and exited in "+ss.stations[ee.Exit()]+", Zone W";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_G_W + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_G_W+"0";
				}		
	}
               }
                  
                  if (ee.Entry() >= 726 && ee.Entry() <= 728){		//entry in zone W
			
			if (ee.Exit() >= 1 && ee.Exit() <= 91){		//exit in zone 1
		
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone W and exited in "+ss.stations[ee.Exit()]+", Zone 1";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_1_W + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_1_W +"0";
				}
					
			}
			
			
			if (ee.Exit() >= 92 && ee.Exit() <= 278){		//exit in zone 2
				
                                                                    travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone W and exited in "+ss.stations[ee.Exit()]+", Zone 2";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_2_W + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_2_W+"0";
				}
					
					
	
			}
		
			if (ee.Exit() >= 279 && ee.Exit() <= 412){		//exit in zone 3
			
                                                                     travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone W and exited in "+ss.stations[ee.Exit()]+", Zone 3";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_3_W + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_3_W+"0";
				}
			}
			
			
			
			if (ee.Exit() >= 413 && ee.Exit() <= 540){		//exit in zone 4
				
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone W and exited in "+ss.stations[ee.Exit()]+", Zone 4";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_4_W + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_4_W+"0";
				}
			}
		
			
			
			if (ee.Exit() >= 541 && ee.Exit() <= 611){		//exit in zone 5
				
				travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone W and exited in "+ss.stations[ee.Exit()]+", Zone 5";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_5_W + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_5_W+"0";
				}
			}		
		
			
			if (ee.Exit() >= 612 && ee.Exit() <= 692){		//exit in zone 6
				
                                                                     travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone W and exited in "+ss.stations[ee.Exit()]+", Zone 6";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_6_W + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_6_W+"0";
				}
			}
			
			
			if (ee.Exit() >= 693 && ee.Exit() <= 703){		//exit in zone 7
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone W and exited in "+ss.stations[ee.Exit()]+", Zone 7";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_7_W + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_7_W+"0";
				}
			}
			
			
			if (ee.Exit() >= 704 && ee.Exit() <= 711){		//exit in zone 8
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone W and exited in "+ss.stations[ee.Exit()]+", Zone 8";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_8_W + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_8_W+"0";
				}
			}
			
			
			if (ee.Exit() >= 712 && ee.Exit() <= 714){		//exit in zone 9
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone W and exited in "+ss.stations[ee.Exit()]+", Zone 9";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_9_W + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_9_W+"0";
				}
                                                    }
			
			
			
			if (ee.Exit() >= 715 && ee.Exit() <= 719){		//exit in zone B
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone W and exited in "+ss.stations[ee.Exit()]+", Zone B";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_B_W + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_B_W+"0";
				}	
			}
			
			
			if (ee.Exit() >= 720 && ee.Exit() <= 721){		//exit in zone C
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone W and exited in "+ss.stations[ee.Exit()]+", Zone C";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_C_W + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_C_W+"0";
				}	
			}
			
			
			
			if (ee.Exit() >= 722 && ee.Exit() <= 725){		//exit in zone G
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone W and exited in "+ss.stations[ee.Exit()]+", Zone G";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_G_W+ PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_G_W+"0";
				}	
			}
			
			
			if (ee.Exit() >= 726 && ee.Exit() <= 728){		//exit in zone W
				
			                 travelMessage = "\nYou entered in "+ss.stations[ee.Entry()]+", Zone W and exited in "+ss.stations[ee.Exit()]+", Zone W";
				
				if ((cc.atualHour >= cc.sevenHour && cc.atualHour <= cc.tenHour || cc.atualHour >= cc.sixteenHour && cc.atualHour <= cc.twentyHour) && (cc.atualWeekDay != 1 && cc.atualWeekDay != 7)){
					
					travelPrice = "Cost of travel: £"+(pc.zone_W_W + PeakPrice)+"0";
									
				} else {
					travelPrice = "Cost of travel: £"+pc.zone_W_W+"0";
				}		
	}
               }
        }
     }
}
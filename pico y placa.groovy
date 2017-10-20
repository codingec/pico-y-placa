import java.text.SimpleDateFormat
        Date thedate = new Date();

       def simpleDateformat = new SimpleDateFormat("EEEE") 
       def dateN = simpleDateformat.format(thedate)
 
       Calendar calendar = Calendar.getInstance()
       calendar.setTime(thedate)
       def d = calendar.get(Calendar.DAY_OF_WEEK)
       def plateNum = ['PCB-111','PCB-222','PCB-333','PCB-444' ,'PCB-555', 'PCB-666', 'PCB-777', 'PCB-888', 'PCB-999', 'PCB-000',
                       'IBC-111','IBC-222','IBC-333','IBC-444' ,'IBC-555', 'IBC-666', 'IBC-777', 'IBC-888', 'IBC-999', 'IBC-000']
       
       
       List gettingData=[]
     switch (d) {
          case 2:
       gettingData <<[as : plateNum.findAll { item -> 
                     item.contains(1.toString()) 
                     }]
       
       gettingData <<[as : plateNum.findAll { item -> 
                     item.contains(2.toString()) 
                     }]
     break
          case 3:
       gettingData <<[as : plateNum.findAll { item -> 
                     item.contains(3.toString()) 
                     }]
       
       gettingData <<[as : plateNum.findAll { item -> 
                      item.contains(4.toString()) 
                      }]
     break
          case 4:
       gettingData <<[as : plateNum.findAll { item -> 
                     item.contains(5.toString()) 
                     }]
       
       gettingData <<[as : plateNum.findAll { item -> 
                      item.contains(6.toString()) 
                      }]
     break
          case 5:
       gettingData <<[as : plateNum.findAll { item -> 
                     item.contains(7.toString()) 
                     }]
       
       gettingData <<[as : plateNum.findAll { item -> 
                     item.contains(8.toString()) 
                     }]
     break
          case 6:
       gettingData <<[as : plateNum.findAll { item -> 
                     item.contains(9.toString()) 
                     }]
       
       gettingData <<[as : plateNum.findAll { item -> 
                      item.contains(0.toString()) 
                      }]
     break
          
     }
      
       if(gettingData.as.size() >= 1){
       
       print "The cars with these plate numbers, are the ones that can't travel from 7:00 and 9:00 am, and from 16:00 to 19:30 pm, on "+ dateN +" are: "+ gettingData.as.toString().replaceAll("[\\[\\],]", "")
      
       }else{
       print "On weekends you can travel freelly with you car, the day is "+dateN
       
       }
       
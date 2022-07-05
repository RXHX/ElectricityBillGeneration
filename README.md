# ElectricityBillGeneration


  How to Run the Code:
   1. Change your Main Class name to ElectricityBill. (i.e. the Java Class in which you are having the main Method)
   2. Now Copy and Paste all the code to your ElectricityBill Java Class File.
   3. Now you have to run the code.
 

Generation Of Electricity Bill

In this Project I have generated bill for an User based on the Following Information
          
    SNo.      No. of Units        Per Unit Charge ($)
     1         1-200               2.5   
     2         201-500             3.5
     3         501-AnyUnits        5.0
     
Also, I have checked two scenario:

1. In first scenario, I have assumed that the user didn't pay bill on time, and paid the bill after
   15 days, then user has to pay 5% more than his total Bill generated Amount.
2. In Second Scenario, I have asssumed that the user payed the bill on time, and paid the bill before
   15 days, the user has to pay 10% less than his total Bill Generated Amount.
   
   Solution Approach
   
   The solution is made such that for first 200 units it will be charged 2.5/unit. Then for next
   300 units it will be 3.5/unit. Then after that for next 500 units it is charged 5.0/units.
   
   
  You can find the attached screenshot of the outputs below: 
   
![Screenshot1](https://user-images.githubusercontent.com/42030709/177423565-eaf11b6e-614f-46ad-b4e0-0a207a5fa81e.png)
![Screenshot2](https://user-images.githubusercontent.com/42030709/177425491-37c20406-057d-4c8b-bc0c-485c903df232.png)
![Screenshot3](https://user-images.githubusercontent.com/42030709/177425522-c647d6fc-d7a9-4a95-a321-995791602d72.png)
![Screenshot4](https://user-images.githubusercontent.com/42030709/177425535-70ff9ea8-d009-4712-b105-c7e020fff0e1.png)
![Screenshot5](https://user-images.githubusercontent.com/42030709/177425545-422542b5-a238-4a3b-8d45-08b31d4b056a.png)
![Screenshot6](https://user-images.githubusercontent.com/42030709/177425551-92f7b8c3-136b-49c8-9f93-df20b99fbafe.png)
![Screenshot7](https://user-images.githubusercontent.com/42030709/177425560-107198d9-9d04-4c3a-a84e-2a39b3140bcb.png)

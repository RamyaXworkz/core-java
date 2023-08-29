class SensorsExecutors{
public static void main(String auto[]){

Sensors sensor1 = new Sensors();
sensor1.sensorType = "Temperature";
sensor1.workingVoltageInVolts = 750;
sensor1.resolution = "2 m degree C @30 degree C";
sensor1.precision = "0.1 degree C";
sensor1.accuracy = "<0.1 Degree C ";
sensor1.provideAutomatic();
System.out.println("Sensor Type is "+sensor1.sensorType);
System.out.println("working Voltage In Volts "+sensor1.workingVoltageInVolts);
System.out.println("Sensor resolution is "+sensor1.resolution);
System.out.println("Sensor precision is "+sensor1.precision);
System.out.println("Sensor accuracy is "+sensor1.accuracy);
System.out.println(
	
	"-----------------------------------------------------------------------------------------------------------");

Sensors sensor2 = new Sensors();
sensor2.sensorType = "Voltage Sensor";
sensor2.workingVoltageInVolts = 12 ;
sensor2.resolution = "78mV";
sensor2.precision = "+ or - 30V";
sensor2.accuracy = "0.5%";
sensor2.provideAutomatic();
System.out.println("Sensor Type is "+sensor2.sensorType);
System.out.println("working Voltage In Volts "+sensor2.workingVoltageInVolts);
System.out.println("Sensor resolution is "+sensor2.resolution);
System.out.println("Sensor precision is "+sensor2.precision);
System.out.println("Sensor accuracy is "+sensor2.accuracy);
System.out.println(
	
	"-----------------------------------------------------------------------------------------------------------");

Sensors sensor3 = new Sensors();
sensor3.sensorType = "UltaSonic Sensor";
sensor3.workingVoltageInVolts = 5;
sensor3.resolution = "1cm";
sensor3.precision = "0.1 - 0.2%";
sensor3.accuracy = "1%";
sensor3.provideAutomatic();
System.out.println("Sensor Type is "+sensor3.sensorType);
System.out.println("working Voltage In Volts "+sensor3.workingVoltageInVolts);
System.out.println("Sensor resolution is "+sensor3.resolution);
System.out.println("Sensor precision is "+sensor3.precision);
System.out.println("Sensor accuracy is "+sensor3.accuracy);
System.out.println(
	
	"-----------------------------------------------------------------------------------------------------------");

Sensors sensor4 = new Sensors();
sensor4.sensorType = "IR Sensor";
sensor4.workingVoltageInVolts = 28;
sensor4.resolution = "infinte ";
sensor4.precision = "<1%";
sensor4.accuracy = "+/-0.25% or +/-0.1% of full scale ";
sensor4.provideAutomatic();
System.out.println("Sensor Type is "+sensor4.sensorType);
System.out.println("working Voltage In Volts "+sensor4.workingVoltageInVolts);
System.out.println("Sensor resolution is "+sensor4.resolution);
System.out.println("Sensor precision is "+sensor4.precision);
System.out.println("Sensor accuracy is "+sensor4.accuracy);
System.out.println(
	
	"-----------------------------------------------------------------------------------------------------------");

Sensors sensor5 = new Sensors();
sensor5.sensorType = "Humidity Sensor";
sensor5.workingVoltageInVolts = 5;
sensor5.resolution = "1%";
sensor5.precision = "+ or - 0.5% ";
sensor5.accuracy = "+ or -  0.2°C";
sensor5.provideAutomatic();
System.out.println("Sensor Type is "+sensor5.sensorType);
System.out.println("working Voltage In Volts "+sensor5.workingVoltageInVolts);
System.out.println("Sensor resolution is "+sensor5.resolution);
System.out.println("Sensor precision is "+sensor5.precision);
System.out.println("Sensor accuracy is "+sensor5.accuracy);
System.out.println(
	
	"-----------------------------------------------------------------------------------------------------------");

}
}
output: classes/mlr_agent/agentMLR.class
	java -cp ~/Library/JADE/jade.jar:classes jade.Boot -gui -agents Felipe_Tlaxcala:mlr_gradientagent.AgentMLR


classes/mlr_agent/agentMLR.class:
	javac -classpath ~/librerias/jade.jar -d classes src/mlr_gradientagent/*.java

clean:
	rm classes/mlr_gradientagent/*.class

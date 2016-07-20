package org.conceptoriented.sc.core;

import java.util.List;
import java.util.Map;

/**
 * Abstract class that can be extended by custom column plug-ins. 
 */
public abstract class EvaluatorBase implements ScEvaluator {

	public Column thisColumn; // It is output column. It is the first column in dependencies.

	@Override
	public void setColumn(Column column) {
		thisColumn = column;
	}
	
	@Override
	public void setColumns(List<Column> columns) {
	}

	@Override
	public void beginEvaluate() { }

	@Override
	public void evaluate(long row) { }

	@Override
	public void endEvaluate() {	}

}

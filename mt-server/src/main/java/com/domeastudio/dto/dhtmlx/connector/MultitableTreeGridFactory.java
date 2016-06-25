package com.domeastudio.dto.dhtmlx.connector;

public class MultitableTreeGridFactory extends TreeGridFactory {

	public RenderStrategy createRenderStrategy() {
		return new MultitableTreeRenderStrategy();
	}
	
}

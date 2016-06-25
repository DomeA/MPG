package com.domeastudio.dto.dhtmlx.connector;

public class MultitableTreeFactory extends TreeFactory {

	public RenderStrategy createRenderStrategy() {
		return new MultitableTreeRenderStrategy();
	}

}

package com.domeastudio.dto.dhtmlx.connector;

public class TreeGridGroupFactory extends TreeGridFactory {

	public RenderStrategy createRenderStrategy() {
		return new GroupRenderStrategy();
	}

}

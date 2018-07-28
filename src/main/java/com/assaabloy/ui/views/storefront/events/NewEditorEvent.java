package com.assaabloy.ui.views.storefront.events;

import com.vaadin.flow.component.ComponentEvent;
import com.assaabloy.ui.views.orderedit.OrderItemsEditor;

public class NewEditorEvent extends ComponentEvent<OrderItemsEditor> {

	public NewEditorEvent(OrderItemsEditor component) {
		super(component, false);
	}
}
package com.liferay.training.gradebook.web.portlet;

import com.liferay.training.gradebook.web.constants.GradebookPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author mauri
 */
@Component(
		immediate = true,
		property = {
				"com.liferay.portlet.display-category=training",
				"com.liferay.portlet.css-class-wrapper=gradebook-portlet",
				"com.liferay.portlet.header-portlet-css=/css/main.css",
				"com.liferay.portlet.instanceable=false",
				"javax.portlet.display-name=Gradebook",
				"javax.portlet.init-param.template-path=/",
				"javax.portlet.init-param.view-template=/view.jsp",
				"javax.portlet.name=" + GradebookPortletKeys.Gradebook,
				"javax.portlet.resource-bundle=content.Language",
				"javax.portlet.security-role-ref=power-user,user",
				"javax.portlet.init-param.add-process-action-success-action=false"
		},
		service = Portlet.class
)
public class GradebookPortlet extends MVCPortlet {
}
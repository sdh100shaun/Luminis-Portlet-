package uk.ac.nottingham.portal.portlets.ugadetails.controllers;


import com.sghe.luminis.person.entity.Person;
import com.sghe.luminis.session.SessionInfo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.mvc.AbstractController;

import javax.portlet.*;

import com.sghe.luminis.person.valueobject.PersonValueObject;


import java.util.Collection;


/**
 * SAMPLE CONTROLLER SET UP FOR PORTLET
 * Template created by Shaun Hare / David Simpson
 * Version 1.0   11.11.2010.
 *
 * Changelog.
 *
 *
 *
 */
public class IndexController extends AbstractController {

    /*
        Logger - always create a logger and log within your application
     */
    private Log logger;

    public IndexController()
    {





        logger = LogFactory.getLog(IndexController.class);

        logger.debug("initialised controller");
        
    }

    /**
     * Handle requests for the controller not derived from form posting
     * @param renderRequest
     * @param renderResponse
     * @return
     * @throws Exception
     */
    @Override
    public ModelAndView handleRenderRequestInternal(RenderRequest renderRequest, RenderResponse renderResponse) throws Exception
    {

            SessionInfo sessionInfo = SessionInfo.lookup();
            System.out.println(sessionInfo.toString());
            Person person = sessionInfo.getCurrentPerson();

            ModelAndView modelAndView = new ModelAndView("index");
            modelAndView.getModel().put("person",person); 

        
        return modelAndView;
    }


    /**
     *  Handle requests for forms
     * @param request
     * @param response
     * @throws Exception
     */
    @Override
    protected void handleActionRequestInternal(ActionRequest request, ActionResponse response) throws Exception {

    }
}

package uk.ac.nottingham.portal.portlets;

import junit.framework.TestCase;
import org.springframework.mock.web.portlet.MockRenderRequest;
import org.springframework.mock.web.portlet.MockRenderResponse;
import org.springframework.web.portlet.ModelAndView;
import uk.ac.nottingham.portal.portlets.ugadetails.controllers.IndexController;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * A sample testCase for the index controller
 * Created by Shaun Hare & David Simpson
 * Version 1.0 11.11.2010
 */
public class IndexControllerTestCase extends TestCase
{
    private RenderRequest renderRequest;
    private RenderResponse renderResponse;




    public void setUp()
    {

        renderRequest = new MockRenderRequest();
        renderResponse = new MockRenderResponse();

    }

    public void testIndexControllerDisplaysAppropriateView()
    {

        IndexController indexController = new IndexController();

        ModelAndView modelAndView;


        try {

                modelAndView = indexController.handleRenderRequestInternal(renderRequest,renderResponse);
                assertEquals("Got appropriate view","index", modelAndView.getViewName());

        } catch (Exception e) {


           e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }





    }

}

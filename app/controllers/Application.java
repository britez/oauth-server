package controllers;

import play.mvc.*;
import play.data.*;

import views.html.application.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render());
    }
    
    public static Result create() {
    	getApplicationForm().save();
    	flash("message","Application created successfuly");
    	return redirect(routes.Application.index());
    }
    
    private static models.Application getApplicationForm(){
    	Form<models.Application> appForm = Form.form(models.Application.class).bindFromRequest();
    	return appForm.get();
    }

}

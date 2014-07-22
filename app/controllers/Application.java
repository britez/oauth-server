package controllers;

import play.mvc.*;
import play.data.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render());
    }
    
    public static Result create() {
    	Form.form(models.Application.class).bindFromRequest().get().save();
    	flash("message","Application created successfuly");
    	return ok(index.render());
    }

}

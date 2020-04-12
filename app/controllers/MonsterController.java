package controllers;

import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

public class MonsterController extends Controller {

    public Result index(Http.Request request) {
        return ok();
    }

    public Result save(Http.Request request) {
        return ok();
    }

    public Result update(Http.Request request, Integer id) {
        return ok();
    }
}

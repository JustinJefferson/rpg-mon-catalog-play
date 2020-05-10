package controllers;

import models.Monster;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import utils.MonsterBuilder;

import javax.inject.Inject;

public class MonsterController extends Controller {

    private final FormFactory formFactory;

    @Inject
    public MonsterController(final FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    public Result index(Http.Request request) {
        return ok(Json.toJson(Monster.FIND.all()));
    }

    public Result indexAt(Http.Request request, Integer id) {
        return ok(Json.toJson(Monster.FIND.byId(id)));
    }

    public Result create(Http.Request request) {
        DynamicForm form = formFactory.form().bindFromRequest(request);
        if(form == null) {
            return badRequest();
        }

        Monster monster = new MonsterBuilder().update(form).build();
        monster.save();
        return ok(monster.getId().toString());
    }

    public Result update(Http.Request request, Integer id) {
        DynamicForm form = formFactory.form().bindFromRequest(request);
        if(form == null) return badRequest();

        Monster monster = new MonsterBuilder(Monster.FIND.byId(id)).update(form).build();
        monster.save();
        return ok(monster.getId().toString());
    }

    public Result delete(Http.Request request, Integer id) {
        Monster.FIND.deleteById(id);
        return Monster.FIND.byId(id) == null ? ok() : badRequest();
    }
}

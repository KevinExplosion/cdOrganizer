import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/list", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();

      String title = request.queryParams("title");
      Cd myCd = new Cd(title);
      model.put("cds", Cd.all());
      model.put("template", "templates/list.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/list", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("cds", Cd.all());
      model.put("template", "templates/list.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/titles/:id", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();

      Cd cd = Cd.find(Integer.parseInt(request.params(":id")));
      model.put("cd", cd);
      model.put("template", "templates/titles.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/titles", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();

      model.put("cds", Cd.all());
      model.put("template", "templates/titles.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}

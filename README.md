# springboot

## @Controller
### Pasar datos a la vista - Model 
```java

index(Model model) o index(ModelMap model)
    model.addAttribute("name", "value");

index(Map<String, Object> map)
    model.put("name", "value");

ModelAndView index(ModelAndView mv)
    mv.addObject("name", "value");
    mv.setViewName("index");
    return mv;

```

### @RequestMapping
Para agregar una ruta raiz base a los metodos del controlador

```java
@Controller
@RequestMapping("/app")
public class IndexController {
```


## TORTOISESVN


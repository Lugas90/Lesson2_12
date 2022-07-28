package com.example.lesson2_12;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
    @RequestMapping("/calculator")
    public class CalculatorController {

        private final CalculatorService calculatorService;

        public CalculatorController (CalculatorService calculatorService){
            this.calculatorService = calculatorService;
        }

        @GetMapping
        public String hello (){
            return "Добро пожаловать в калькулятор!";
        }

        @GetMapping(path = "/plus")
        public String plus (@RequestParam(required = false) Integer num1,
                            @RequestParam(required = false) Integer num2){
            if (num1 == null){
                return "Ошибка, введите первое число";
            } else if (num2 == null) {
                return "ошибка, введите второе число";
            }
            return num1 + " + " + num2  + " = " + calculatorService.plus(num1, num2);
        }

        @GetMapping(path = "/minus")
        public String minus(@RequestParam(required = false) Integer num1,
                            @RequestParam(required = false) Integer num2){
            if (num1 == null){
                return "Ошибка, введите первое число";
            } else if (num2 == null) {
                return "ошибка, введите второе число";
            }
            return num1 + " - " + num2  + " = " + calculatorService.minus(num1, num2);
        }

        @GetMapping(path = "/multiply")
        public String multiply (@RequestParam(required = false) Integer num1,
                                @RequestParam(required = false) Integer num2){
            if (num1 == null){
                return "Ошибка, введите первое число";
            } else if (num2 == null) {
                return "ошибка, введите второе число";
            }
            return num1 + " * " + num2  + " = " + calculatorService.multiply(num1, num2);
        }

        @GetMapping(path = "/divide")
        public String divide (@RequestParam(required = false) Integer num1,
                              @RequestParam(required = false) Integer num2){
            if (num1 == null){
                return "Ошибка, введите первое число";
            } else if (num2 == null) {
                return "ошибка, введите второе число";
            }else if (num2 == 0){
                return "Ошибка, нет деления на ноль";
            }
            return num1 + " / " + num2  + " = " + calculatorService.divide(num1, num2);
        }
}

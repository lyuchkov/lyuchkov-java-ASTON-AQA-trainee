### lyuchkov-java-ASTON-AQA-trainee
# Техническое задание для кандидатов на стажировку - QA Automation Trainee  
## Лючков Дмитрий  
## Язык Java 11  

### Ответ на задание 4:   
Нет, эта скобочная последовательность неправильная.  
Для того, чтобы она стала верной нужно либо удалить лишние закрывающие скобки, чтобы получилось следующее:  
`[(())()(())]`  
  
Либо добавить новые, например, так:  
`[((()))()(())][]`  

Это можно перепроверить при помощи класса BracketsChecker и метода isCorrect(String str).
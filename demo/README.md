# following curl command works
```curl -i -X POST -H "Content-Type:application/json" -d '{"name": "Andy Thomas", "employmentType": "http://localhost:8080/employmentTypes/1"}' http://localhost:8080/users/createUserWithEmploymentType```

# following curl command does not works
```curl -i -X POST -H "Content-Type:application/json" -d '[{"name": "Tom Cady", "skills": ["http://localhost:8080/skills/1", "http://localhost:8080/skills/2"]}]' http://localhost:8080/users/createUserWithSkillBatch```

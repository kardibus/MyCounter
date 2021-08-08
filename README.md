#### Create Data Meter


#### Create User
    let history = {
    "id":"2", 
    "name":"2",
    "surname":"1",
    "email":"1",
    "subscribe":"NONE",
    "active":"true",
    "lastActive":"2021-08-04T15:55:34.000+00:00",
    "registrationDate":"2021-08-04T15:55:41.000+00:00"
    };

    let response = await fetch('http://localhost:8888/api/users/', {
    method: 'POST',
    headers: {
    'Content-Type': 'application/json;charset=utf-8'
    },
    body: JSON.stringify(history)
    });

    let result = await response.json();
    console.log(result);
#### Delete User
    let history = {
    "id":"2"
    };

    let response = await fetch('http://localhost:8888/api/users/', {
    method: 'DELETE',
    headers: {
    'Content-Type': 'application/json;charset=utf-8'
    },
    body: JSON.stringify(history)
    });

    let result = await response.json();
    console.log(result);

#### Get All Users
    let response = await fetch('http://localhost:8888/api/users/', {
    method: 'GET',
    headers: {
    'Content-Type': 'application/json;charset=utf-8'
    }});

    let result = await response.json();
    console.log(result);
#### Update User
    let history = {
    "id":"7",
    "name":"3",
    "surname":"1234",
    "email":"1",
    "subscribe":"NONE",
    "active":"true",
    "lastActive":"2021-08-04T15:55:34.000+00:00",
    "registrationDate":"2021-08-04T15:55:41.000+00:00"
    };

    let response = await fetch('http://localhost:8888/api/users/', {
    method: 'PUT',
    headers: {
    'Content-Type': 'application/json;charset=utf-8'
    },
    body: JSON.stringify(history)
    });

    let result = await response.json();
    console.log(result);

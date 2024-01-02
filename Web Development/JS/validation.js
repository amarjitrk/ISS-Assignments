document.getElementById('registrationForm').onsubmit = function(event) {
    var name = document.getElementById('name').value;
    var email = document.getElementById('email').value;

    if(name === '' || email === '') {
        alert('Name and email are required!');
        event.preventDefault();
    }
}

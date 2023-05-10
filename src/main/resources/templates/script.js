function edit() {
    let edit = document.getElementById('edit');
    edit.disabled = true;

    let pause = document.getElementById('pause');
    pause.disabled = false;

    let list = document.getElementsByClassName('element');
    for (let i = 0; i < list.length; i++) {
        list[i].disabled = false;
    }
}

function pause() {

    let pause = document.getElementById('pause');
    pause.disabled = true;

    let list = document.getElementsByClassName('element');
    for (let i = 0; i < list.length; i++) {
        list[i].disabled = true;
    }

    let edit = document.getElementById('edit');
    edit.disabled = false;

}

function createNewUser() {
    let add = document.getElementById('add');
    add.disabled = true;

    let name = document.getElementById('name');
    name.disabled = false;
    let surname = document.getElementById('surname');
    surname.disabled = false;
    let age = document.getElementById('age');
    age.disabled = false;
    let email = document.getElementById('email');
    email.disabled = false;

    let clear = document.getElementById('clear');
    clear.disabled = false;
    let create = document.getElementById('create');
    create.disabled = false;
}
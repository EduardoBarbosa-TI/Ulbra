const data = [
    { name: "Daniel", age: 25 },
    { name: "Edu", age: 30 },
    { name: "João", age: 22 }
];

function start() {
   const list = document.getElementById("list");

   list.innerHTML = getList(data);
}

function getList(data){
    return data.map(item => {
        return (
            `<li>${item.name} - ${item.age}</li> `
        )
    }).join("")
}
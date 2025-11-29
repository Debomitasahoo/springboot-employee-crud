const API_URL = "http://localhost:8083";

const form = document.getElementById("employeeForm");
const empTable = document.getElementById("empTable");

async function loadEmployees() {
  const res = await fetch(`${API_URL}/getEmp`);
  const employees = await res.json();

  empTable.innerHTML = "";
  employees.forEach(emp => {
    empTable.innerHTML += `
      <tr>
        <td>${emp.id}</td>
        <td>${emp.name}</td>
        <td>${emp.age}</td>
        <td>${emp.salary}</td>
        <td>
          <button class="edit" onclick="editEmp(${emp.id}, '${emp.name}', ${emp.age}, ${emp.salary})">Edit</button>
          <button class="delete" onclick="deleteEmp(${emp.id})">Delete</button>
        </td>
      </tr>
    `;
  });
}

form.addEventListener("submit", async (e) => {
  e.preventDefault();

  const id = document.getElementById("empId").value;
  const name = document.getElementById("name").value;
  const age = document.getElementById("age").value;
  const salary = document.getElementById("salary").value;

  const emp = { name, age, salary };

  if (id) {
    await fetch(`${API_URL}/updateEmp/${id}`, {
      method: "PUT",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(emp),
    });
  } else {
    await fetch(`${API_URL}/addEmp`, {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(emp),
    });
  }

  form.reset();
  loadEmployees();
});

async function deleteEmp(id) {
  await fetch(`${API_URL}/deleteEmp/${id}`, { method: "DELETE" });
  loadEmployees();
}

function editEmp(id, name, age, salary) {
  document.getElementById("empId").value = id;
  document.getElementById("name").value = name;
  document.getElementById("age").value = age;
  document.getElementById("salary").value = salary;
}

loadEmployees();

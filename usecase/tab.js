
document.addEventListener('DOMContentLoaded', function() {
   
    document.getElementById('myForm').addEventListener('submit', function(e) {
        e.preventDefault(); // Prevent default form submission
       
        // Get form values
        var name = document.getElementById('name').value;
        var email = document.getElementById('email').value;
        var phone = document.getElementById('phone').value;
        var account = document.getElementById('account').value;
        var accountSelect = document.getElementById('account');
       
        if (accountSelect.value === 'select') {
            alert('Please select an account type');
            return;
        }
       
        if (!name || !email || !phone || !account) {
            alert('Please fill in all fields.');
            return;
        }
       
        // Create table row
        var newRow = document.createElement('tr');
        newRow.innerHTML = '<td>' + name + '</td>' +
                           '<td>' + email + '</td>'+
                           '<td>' + phone + '</td>' +
                           '<td>' + account + '</td>' ;
       
        // Append row to table body
        document.querySelector('#tabledata tbody').appendChild(newRow);
       
        // Show the table
        document.getElementById('tabledata').style.display = 'table';
       
        // Reset form fields
        document.getElementById('myForm').reset();
    });
});
 
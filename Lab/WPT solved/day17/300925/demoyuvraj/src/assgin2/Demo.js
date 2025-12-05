import React, { useEffect, useState } from "react";
import axios from "axios";
import './style.css';

const GetData = () => {
    const [data, setData] = useState([]);

    const [error, setError] = useState(null);

     const btn=useEffect(() => {
       
        axios
            .get("https://jsonplaceholder.typicode.com/posts")
            .then((response) => {
                setData(response.data);
                console.log(response.data)
            })
            .catch((err) => {
                setError(err.message);

            });
            {data.map((post) => (
                    <li key={post.id}> </li>
                ))}
    }, []);

 
    if (error) return <div>Error: {error}</div>;

    return (
        <div>
            <h1>Posts</h1>
           
            <table>
            <thead>
               <tr> 
                        <th>UserId</th>
                        <th>Title</th>
                    </tr>
            </thead>
            <tbody>
                <tr>
                    <td> 
                    {data.map((post) => (
                        <ol>
                        <li key={post.id}> </li>
                        </ol>
                   
                ))}
                
                </td>
                    <td>
                        
                         {data.map((post) => (
                            <li key={post.id}>{post.title}</li>
 
                    
                ))}
                    </td>
                </tr>
            </tbody>
                    
               
            </table>
            <button  onClick={btn}> submit</button>
        </div>
    );
};

export default GetData;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

/* Autor: Steven leiva*/
/* Grupo 5*/
namespace DemoLibrary
{
    public interface IManager : IEmployee
    {
        void GeneratePerformanceReview();
    }
}
